import java.util.*;
import java.util.function.BiConsumer;

public class Pocket {
    Scanner input = new Scanner(System.in);
    HashMap<String, Integer> pocket = new HashMap<>();
    public void addItem() {
        System.out.println("Please enter the name of an item:");
        String item = input.nextLine();
        System.out.println("Please enter a quantity for this item:");
        int qty = Integer.parseInt(input.nextLine());
        pocket.put(item, qty);
    }
    public void discardItem() {
        System.out.println("Please enter an item in your Bag:");
        String item = input.nextLine();
        while (!pocket.containsKey(item)) {
            System.out.println("Sorry, that item isn't in your Bag.\nTry again:");
            item = input.nextLine();
        }
        System.out.println("You have " + pocket.get(item) + ".\nHow many will you discard?");
        int dsc = Integer.parseInt(input.nextLine());
        while (dsc > pocket.get(item)) {
            System.out.println("You can't discard more than " + pocket.get(item) + ".");
            dsc = Integer.parseInt(input.nextLine());
        }
        int total = pocket.get(item) - dsc;
        if (total == 0) {
            pocket.remove(item);
        }
        else {
            pocket.put(item, total);
        }
    }
    public void checkItem() {
        System.out.println("Choose an item to check:");
        String item = input.nextLine();
        while (!pocket.containsKey(item)) {
            System.out.println("Sorry, that item isn't in your Bag.\nTry again:");
            item = input.nextLine();
        }
        System.out.println("You have " + pocket.get(item) + " " + item + "(s).");
    }
    public void showItems() {
        BiConsumer<String, Integer> action = (x, y) -> {
            StringBuilder blanks = new StringBuilder();
            blanks.append(" ".repeat(Math.max(0, 20 - x.length())));
            String blank = blanks.toString();
            System.out.println(x + blank + " " + y);
        };
        System.out.println("Item                 Qty\n-------------------------");
        pocket.forEach(action);
    }
    public int getSize() {
        return pocket.size();
    }
}

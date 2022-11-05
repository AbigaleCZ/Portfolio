package abstractClasses;
import java.util.*;
public class MedicinePocket extends Pocket {
    Scanner input = new Scanner(System.in);
    private ArrayList<Integer> qty = new ArrayList<Integer>();
    public void addItem() {
        System.out.println("Name the item you wish to add to the Medicine Pocket:");
        items.add(input.nextLine());
        index++;
        StringBuilder blank = new StringBuilder();
        for (int i = 1; i <= 20 - items.get(index).length(); i++) {
            blank.append(" ");
        }
        blanks.add(blank.toString());
        System.out.println("How many of this item would you like to add?");
        qty.add(Integer.parseInt(input.nextLine()));
    }
    public void removeItem() {
        System.out.println("Please enter a number between 0 and " + index + " to designate an item to be removed:");
        int rem = input.nextInt();
        items.remove(rem);
        blanks.remove(rem);
        qty.remove(rem);
        index--;
    }
    public void viewPocket() {
        System.out.println("Item                Qty" +
                "\n-----------------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + blanks.get(i) + qty.get(i));
        }
    }
}

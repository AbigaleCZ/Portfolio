package abstractClasses;
import java.util.*;
public class KeyItemsPocket extends Pocket {
    Scanner input = new Scanner(System.in);
    public void addItem() {
        System.out.println("Name the item you wish to add to the Key Items Pocket:");
        items.add(input.nextLine());
        index++;
        StringBuilder blank = new StringBuilder();
        for (int i = 1; i <= 20 - items.get(index).length(); i++) {
            blank.append(" ");
        }
        blanks.add(blank.toString());
    }
    public void removeItem() {
        System.out.println("You can't throw away Key Items.");
    }
    public void viewPocket() {
        System.out.println("Item                " +
                "\n--------------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + blanks.get(i));
        }
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pocket pocket = new Pocket();
        int choice;
        while (true) {
            System.out.println("This pocket has " + pocket.getSize() + " item(s).\n\n1. Add item\n2. Discard item\n3. Check item\n4. List items\n5. Quit");
            choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                pocket.addItem();
                input.nextLine();
            }
            else if (choice == 2) {
                pocket.discardItem();
                input.nextLine();
            }
            else if (choice == 3) {
                pocket.checkItem();
                input.nextLine();
            }
            else if (choice == 4) {
                pocket.showItems();
                input.nextLine();
            }
            else if (choice == 5) {
                break;
            }
            else {
                System.out.println("Invalid entry.");
                input.nextLine();
            }
        }
    }
}

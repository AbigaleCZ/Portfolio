import stringArrayList.StringArrayList;
import java.util.*;
public class TestStringList {
    public static void main(String[] args) {
        StringArrayList items = new StringArrayList();
        menu(items);
    }
    public static void menu(StringArrayList list) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                This is the List Management Interface.
                You may choose one of the options below:
                
                1. Add an item
                2. Remove an item
                3. View an item
                4. Count all items
                5. List items using a for loop
                6. List items using a for each loop
                7. Quit
                """);
        int choice = input.nextInt();
        while (true) {
            if (choice == 0) {
                System.out.print("""
                This is the List Management Interface.
                You may choose one of the options below:
                
                1. Add an item
                2. Remove an item
                3. View an item
                4. Count all items
                5. List items using a for loop
                6. List items using a for each loop
                7. Quit
                """);
                choice = input.nextInt();
            }
            else if (choice == 1) {
                list.addString();
                System.out.println("You may now select an option from the main menu, or enter 0 to view the options again.");
                choice = input.nextInt();
            }
            else if (choice == 2) {
                list.removeString();
                System.out.println("You may now select an option from the main menu, or enter 0 to view the options again.");
                choice = input.nextInt();
            }
            else if (choice == 3) {
                list.viewString();
                System.out.println("You may now select an option from the main menu, or enter 0 to view the options again.");
                choice = input.nextInt();
            }
            else if (choice == 4) {
                list.countStrings();
                System.out.println("You may now select an option from the main menu, or enter 0 to view the options again.");
                choice = input.nextInt();
            }
            else if (choice == 5) {
                list.forList();
                System.out.println("You may now select an option from the main menu, or enter 0 to view the options again.");
                choice = input.nextInt();
            }
            else if (choice == 6) {
                list.eachList();
                System.out.println("You may now select an option from the main menu, or enter 0 to view the options again.");
                choice = input.nextInt();
            }
            else if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid option. Enter a valid option or enter 0 to view the options again.");
                choice = input.nextInt();
            }
        }
    }
}

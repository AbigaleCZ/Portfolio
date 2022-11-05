import abstractClasses.*;
import java.util.*;
public class TestAbstract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        System.out.println("Type 'medicine' or 'key items' to create an item pocket:");
        choice = input.nextLine();
        while (!choice.equalsIgnoreCase("medicine") && !choice.equalsIgnoreCase("key items")) {
            System.out.println("Invalid entry. Please enter 'medicine' or 'key items':");
            choice = input.nextLine();
        }
        if (choice.equalsIgnoreCase("medicine")) {
            medsPocket();
        }
        else {
            keyPocket();
        }
    }
    public static void medsPocket() {
        MedicinePocket pocket = new MedicinePocket();
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("How many items would you like to add\nto your Medicine Pocket?");
        choice = input.nextInt();
        for (int i = 0; i < choice; i++) {
            pocket.addItem();
        }
        pocket.viewPocket();
        System.out.println("How many items would you like to remove\nfrom your Medicine Pocket?");
        choice = input.nextInt();
        for (int i = 0; i < choice; i++) {
            pocket.removeItem();
        }
        pocket.viewPocket();
    }
    public static void keyPocket() {
        KeyItemsPocket pocket = new KeyItemsPocket();
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("How many items would you like to add\nto your Key Items Pocket?");
        choice = input.nextInt();
        for (int i = 0; i < choice; i++) {
            pocket.addItem();
        }
        pocket.viewPocket();
        System.out.println("How many items would you like to remove\nfrom your Key Items Pocket?");
        choice = input.nextInt();
        for (int i = 0; i < choice; i++) {
            pocket.removeItem();
        }
        pocket.viewPocket();
    }
}

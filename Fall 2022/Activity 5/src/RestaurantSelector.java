/* Name: Gale Sexton
Data Structures and Objects
Date: 11 Sep, 2022
***************************
This program creates a Scanner object to take in user input, then asks
the user three yes-or-no questions about dietary preferences. Based on
the answer to each question, the program assigns a boolean to each of
the three dietary preferences, then shows the user a list of restaurants
that are compatible with the answers given.
 */
import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String check;
        boolean vegetarian, vegan, glutenFree, yes;
        System.out.println("Please answer 'Yes' or 'No' to the following questions.\nIs anyone in the group vegetarian?");
        check = input.nextLine();
        vegetarian = check.equals("Yes") || check.equals("yes");
        System.out.println("Is anyone in the group vegan?");
        check = input.nextLine();
        vegan = check.equals("Yes") || check.equals("yes");
        System.out.println("Is anyone in the group avoiding gluten?");
        check = input.nextLine();
        glutenFree = check.equals("Yes") || check.equals("yes");
        System.out.println("Your restaurant choices are:\n");
        if (vegan) {
            System.out.println("Corner Café\nThe Chef's Kitchen");
        }
        else if (glutenFree) {
            System.out.println("Main Street Pizza Co.\nCorner Café\nThe Chef's Kitchen");
        }
        else if (vegetarian) {
            System.out.println("Main Street Pizza Co.\nCorner Café\nMama's Fine Italian\nThe Chef's Kitchen");
        }
        else {
            System.out.println("Joe's Gourmet Burgers\nMain Street Pizza Co.\nCorner Café\nMama's Fine Italian\nThe Chef's Kitchen");
        }
    }
}

/* Name: Gale Sexton
Data Structures and Objects
Date: 7 Sep, 2022
********************
This program creates a Scanner object and prompts the user
to input an integer. The program then creates an if else
statement that uses a modulus to divide the integer by 2
and check for a remainder of 0 to determine whether it is
even or odd. Finally, the program prints a line classifying
the integer as even or odd.
*/
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number to find out whether it is even or odd.");
        int number = keyboard.nextInt();
        if (number % 2 == 0)
            System.out.println("This number is even.");
        else
            System.out.println("This number is odd.");
    }
}

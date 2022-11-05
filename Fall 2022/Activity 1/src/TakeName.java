// **********
// Activity #1, Task 1
// Name: Gale Sexton
// Data Strucutures and Objects
// Date: 1 Sep, 2022
// **********
// This program creates a variable for a first name and a last name,
// then creates a Scanner object and prints messages that ask the
// user to input a first and last name. Finally, the program prints a
// line that greets the user by the names given.
// **********

import java.util.Scanner;
public class TakeName {
    public static void main(String[] args) {
        String firstname;
        String lastname;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your first name? ");
        firstname = keyboard.nextLine();
        System.out.print("What is your last name? ");
        lastname = keyboard.nextLine();
        System.out.println("Hello, " + firstname + " " + lastname + "!");
    }
}

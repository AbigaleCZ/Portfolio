/* Name: Gale Sexton
Data Structures and Objects
Date: 1x Sep, 2022
***************************
The program creates a Scanner object to accept user input, then creates
a Random object and assings an integer between 0 and 4 to a variable.
Using a series of if-else-if statements, the program assigns the random
integer to one of five colors, then prompts the user to guess which
color was chosen. Using a for loop, the program repeats this process
ten tiimes, keeping track of correct guesses as it reveals the selected
color.
 */
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class ESPGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number, correct = 0;
        String color, guess;
        for (int i = 1; i <= 10; i++) {
            number = random.nextInt(5);
            if (number == 0) {
                color = "red";
            }
            else if (number == 1) {
                color = "orange";
            }
            else if (number == 2) {
                color = "yellow";
            }
            else if (number == 3) {
                color = "green";
            }
            else {
                color = "blue";
            }
            System.out.printf("%d. What color has the computer chosen?\n", i);
            guess = input.nextLine();
            System.out.printf("THe computer chose %s.\n", color);
            if (guess.equals(color)) {
                correct += 1;
            }
            System.out.printf("You have %d out of %d correct.\n\n", correct, i);
        }
    }
}

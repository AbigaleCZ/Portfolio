/* Name: Gale Sexton
Data Structures and Objects
Date: 12 Sep, 2022
***************************
This program creates a Scanner object for input and asks the user to
play a game of "high or low," taking in their guess or the letter "Q"
to quit. The program uses a while loop with if statements to parse
guesses as integers and compare them to the right answer, giving the
user hints and tallying the number of guesses they've made.
 */
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 37, tries = 0;
        String guess;
        System.out.println("I've just rolled percentile dice. Care to play high or low?\nYou can enter a number or type 'q' to quit.");
        guess = input.nextLine();
        while (true) {
            boolean quit = guess.equals("q") || guess.equals("Q");
            if (quit) {
                System.out.printf("You're no fun! You didn't even stick around for %d guess(es)! The number I rolled was %d.", (tries + 1), answer);
                break;
            }
            if (Integer.parseInt(guess) < answer) {
                tries += 1;
                System.out.println("Too low. Try again!");
                guess = input.nextLine();
            }
            else if (Integer.parseInt(guess) > answer) {
                tries += 1;
                System.out.println("Too high. Try again!");
                guess = input.nextLine();
            }
            else if (Integer.parseInt(guess) == answer) {
                tries += 1;
                System.out.printf("Hey, you got it! %d was what I rolled, all right!\nThat only took you %d guess(es).", answer, tries);
                break;
            }
            else {
                System.out.println("Don't give me silly answers; I don't play silly games. Enter a number or type 'q' to quit.");
                guess = input.nextLine();
            }
        }
    }
}

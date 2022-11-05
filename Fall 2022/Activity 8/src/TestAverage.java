/* Name: Gale Sexton
Data Structures and Objects
Date: 12 Sep, 2022
***************************
This program creates a Scanner object to take input from the user.
It then asks the user to identify how many students are being
checked and how many tests each student took. Using nested for
loops, the program takes each score and adds it to a total before
finding the average, printing it, resetting the total, and moving on
to the next student.
 */
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students, tests;
        double score, total = 0, average;
        System.out.println("This is the Test Average Checker.\nHow many students are there?");
        students = input.nextInt();
        System.out.println("Next, how many tests did each student take?");
        tests = input.nextInt();
        for (int i = 1; i <= students; i++) {
            System.out.printf("Gathering scores for Student %d\n", i);
            for (int j = 1; j <= tests; j++) {
                System.out.printf("What was Student %d's score for Test %d?", i, j);
                score = input.nextDouble();
                total += score;
            }
            average = total / tests;
            System.out.printf("The test average for Student %d is %.2f\n", i, average);
            total = 0;
        }
    }
}

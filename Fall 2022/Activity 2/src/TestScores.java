// ********************
// Name: Gale Sexton
// Data Structures and Objeccts
// Date: 7 Sep, 2022
// *****************
// This program creates three integer variables that represent a student's test scores.
// It then creates a Scanner object to record values for those veriables before finding
// the average and storing the result in a flot variable. By using a series of if and
// else if statements, the program compares the average to a set of criteria to determine
// a grade, which it displays in a message dialog.
// *****************
import java.util.Scanner;
import javax.swing.*;
public class TestScores {
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        String grade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Grade Checker. Please enter your first test score.\n");
        score1 = keyboard.nextInt();
        System.out.println("Please enter your second test score.\n");
        score2 = keyboard.nextInt();
        System.out.println("Please enter your third test score.\n");
        score3 = keyboard.nextInt();
        average = (score1 + score2 + score3) / 3.0;
        if (average > 89)
            grade = "A";
        else if (average > 79)
            grade = "B";
        else if (average > 69)
            grade = "C";
        else if (average > 59)
            grade = "D";
        else
            grade = "F";
        JOptionPane.showMessageDialog(null, "With an average score of " + average + ", your grade is " + grade + ".");
        System.exit(0);
    }
}

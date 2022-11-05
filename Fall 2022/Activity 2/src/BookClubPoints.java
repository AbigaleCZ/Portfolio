// ******************
// Name: Gale Sexton
// Data Structures and Objects
// Date: 7 Sep, 2022
// ********************
// This program displays a message dialog that welcomes the user to the program.
// It then displays an input dialog that asks the user for the number of books
// they purchased during the month. Based on the number of books purchased, the
// message dialog that follows will present a different amount of points that the
// user has earned.
// ********************
import javax.swing.*;
public class BookClubPoints {
    public static void main(String[] args) {
        int books = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the Serendipity Book Club Point Checker!\n\nPlease enter the number of books you've purchased this month."));
        int points;
        if (books > 3)
            points = 60;
        else if (books > 2)
            points = 30;
        else if (books > 1)
            points = 15;
        else if (books > 0)
            points = 10;
        else
            points = 0;
        if (points > 0)
            JOptionPane.showMessageDialog(null, "Congratulations! You've earned " + points + " points this month.");
        else
            JOptionPane.showMessageDialog(null, "Sorry, but you need to have purchased at least one book this month to have earned any points.");
        System.exit(0);
    }
}

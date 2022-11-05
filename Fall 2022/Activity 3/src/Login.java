/* Name: Gale Sexton
Data Structures and Objects
Date: 7 Sep, 2022
***************************
This program creates a username and password, then uses input dialogs
to assign user inputs for username and password as separate variables.
The program then compares the input variables to those it had created;
if both sets of variables match, the program welcomes the user to the
class. If only one matches, the program notifies the user on which
entry was incorrect. If neither set matches, the program conveys this
to the user.
 */
import javax.swing.*;
public class Login {
    public static void main(String [] args) {
        String username = "ACZ";
        String password = "saintenzo";
        String name = JOptionPane.showInputDialog("Please enter a username.");
        String pw = JOptionPane.showInputDialog("Please enter a password for that username.");
        if (name.equals(username) && pw.equals(password))
            JOptionPane.showMessageDialog(null, "Welcom to CS 121!");
        else if (pw.equals(password))
            JOptionPane.showMessageDialog(null, "The username you entered is incorrect.");
        else if (name.equals(username))
            JOptionPane.showMessageDialog(null, "The password you entered was incorrect.");
        else
            JOptionPane.showMessageDialog(null, "Both the username and password you entered were incorrect.");
        System.exit(0);
    }
}

/* Name: Gale Sexton
Data Structures and Objects
Date: 7 Sep, 2022
***************************
This program uses input dialogs to assign three integers as variables.
It then checks to make sure that each variable is more than 0; otherwise,
a triangle isn't possible. If all three sides are equal, the program
notifies the user that the triangle they have created is an equilateral
triangle. If two sides are equal, the program classifies the triangle as
isosceles. If none of the sides are equal, the program classifies the
triangle as scalene.
 */
import javax.swing.*;
public class Triangles {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Triangle Checker! Please enter the length of your first side."));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the length of your second side."));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the length of your third side."));
        if (num1 == 0 || num2 == 0 || num3 == 0)
            JOptionPane.showMessageDialog(null, "Um... Whatever you entered is not a triangle. Sorry!");
        else if (num1 == num2 && num1 == num3)
            JOptionPane.showMessageDialog(null, "This triangle is equilateral!");
        else if (num1 == num2 || num1 == num3 || num2 == num3)
            JOptionPane.showMessageDialog(null, "This triangle is isosceles!");
        else
            JOptionPane.showMessageDialog(null, "This triangle is scalene!");
        System.exit(0);
    }
}

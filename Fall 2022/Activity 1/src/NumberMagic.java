// **********
// Name: Gale Sexton
// Data Structures and Objects
// Date: 1 Sep, 2022
// **********
// This program uses input dialogs to receivve two integers
// from the user. It then uses simple arighmetic and methods
// from the Math class to perform addition, subtraction,
// multiplication, and division, as well as demonstrating an
// exponential expression, square root expression, and
// logarithmic expression. These values are then displayed
// using a message dialog.
// **********
import javax.swing.JOptionPane;
public class NumberMagic {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first integer."));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second integer."));
        int sum = num1 + num2;
        int dif = num1 - num2;
        int prd = num1 * num2;
        int qtn = num1 / num2;
        int pwr = (int) Math.pow(num1,num2);
        double sqr1 = Math.sqrt(num1);
        double sqr2 = Math.sqrt(num2);
        double lg1 = Math.log(num1);
        double lg2 = Math.log(num2);
        JOptionPane.showMessageDialog(null, "Time for some number magic!\n" + num1 + " + " + num2 + " = " + sum + "\n" + num1 + " - " + num2 + " = " + dif + "\n" + num1 + " × " + num2 + " = " + prd + "\n" + num1 + " ÷ " + num2 + " = " + qtn + "\n" + num1 + " to the power of " + num2 + " is " + pwr + "\nThe square root of " + num1 + " is " + sqr1 + "\nThe square root of " + num2 + " is " + sqr2 + "\nThe lgo of " + num1 + " is " + lg1 + "\nThe log of " + num2 + " is " + lg2);
        System.exit(0);
    }
}

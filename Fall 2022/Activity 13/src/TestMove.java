/* Name: Gale Sexton
Data Structures and Objects
Date: 3 Oct, 2022
***************************
This program imports the PKMNMove class, which has been
modified to have different access specifiers for some of
its fields and methods. The program creates a Scanner and
PKMNMove object and attempts to access fields and methods
of the PKMNMove object to demonstrate how public and private
access differs when using a class in a program.
 */
import PackagesDemo.PKMNMove;
import java.util.Scanner;
public class TestMove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PKMNMove move = new PKMNMove();
        System.out.println(move.name);
        System.out.println(move.type);
        // System.out.println(move.category);
        // move.setMove(input.nextLine());
        move.setCategory(input.nextLine());
    }
}

import java.util.*;
public class GCDTest {
    public static void main(String[] args) {
        GCD finder = new GCD();
        String menu = """
                GCD Finder
                Please choose an option:
                
                1. For Loop
                2. While Loop
                3. Recursion
                4. Quit
                """;
        String menu2 = """
                 What now?
                
                0. Main menu
                4. Quit
                """;
        String error = """
                Invalid input. Please try again:
                """;
        System.out.print(menu);
        int choice = getNum(), n1 = 0, n2 = 0, gcd = 0;
        while (true) {
            if (choice == 0) {
                System.out.print(menu);
                choice = getNum();
            }
            else if (choice == 1) {
                System.out.println("Please enter your first number:");
                n1 = getNum();
                System.out.println("Please enter your second number:");
                n2 = getNum();
                gcd = finder.findGCDForLoop(n1, n2);
                System.out.print("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");
                System.out.print(menu2);
                choice = getNum();
            }
            else if (choice == 2) {
                System.out.println("Please enter your first number:");
                n1 = getNum();
                System.out.println("Please enter your second number:");
                n2 = getNum();
                gcd = finder.findGCDWhileLoop(n1, n2);
                System.out.print("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");
                System.out.print(menu2);
                choice = getNum();
            }
            else if (choice == 3) {
                System.out.println("Please enter your first number:");
                n1 = getNum();
                System.out.println("Please enter your second number:");
                n2 = getNum();
                gcd = finder.findGCDRecursive(n1, n2);
                System.out.print("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");
                System.out.print(menu2);
                choice = getNum();
            }
            else if (choice == 4) {
                break;
            }
            else {
                System.out.print(error);
                choice = getNum();
            }
        }
    }
    public static int getNum() {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        return num;
    }
}

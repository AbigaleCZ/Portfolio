/* Name: Gale Sexton
Data Structures and Objects
Date: 22 Sep, 2022
***************************
This program creates a static Scanner object to take user input.
It then uses methods to return doubles for a rectangle's length
and width, a third method to calculate and return the rectangle's
area, and a final method to display the data entered and calculated.
The main method calls these four methods before closing the Scanner
object.
 */
import java.util.Scanner;
public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double length, width, area;
        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();
    }
    public static double getLength() {
        System.out.println("Enter the length of your rectangle.");
        return scanner.nextDouble();
    }
    public static double getWidth() {
        System.out.println("Enter the width of your rectangle.");
        return scanner.nextDouble();
    }
    public static double getArea(double lnt, double wdt) {
        return lnt * wdt;
    }
    public static void displayData(double lnt, double wdt, double rea) {
        System.out.printf("Rectangle Length: %.1f\nRectangle Width:  %.1f\nRectangle Area:   %.1f", lnt, wdt, rea);
    }
}

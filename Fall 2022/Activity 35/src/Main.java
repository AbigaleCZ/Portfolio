import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TotalCalories toCal = new TotalCalories();
        System.out.println("Enter the calories allowed per day:");
        int budget = Integer.parseInt(input.nextLine());
        System.out.println("Enter the diet's start date:");
        String start = input.nextLine();
        System.out.println("Enter the diet's end date:");
        String end = input.nextLine();
        long total = toCal.calcCalories(budget, start, end);
        System.out.println("Total calorie allotment is " + total + ".");
    }
}
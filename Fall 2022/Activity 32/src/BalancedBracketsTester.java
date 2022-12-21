import java.util.*;
public class BalancedBracketsTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String to be checked for balanced brackets:");
        String str = input.nextLine();
        BalancedBrackets.checkString(str);
    }
}

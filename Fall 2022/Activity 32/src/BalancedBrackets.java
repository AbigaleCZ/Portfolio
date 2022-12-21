import java.util.*;
public class BalancedBrackets {
    private static Stack<Character> brackets = new Stack<>();
    private static Stack<Character> braces = new Stack<>();
    private static Stack<Character> parentheses = new Stack<>();
    public static void checkString(String s) {
        char[] chars = s.toCharArray();
        String bracket = "unbalanced", brace = "unbalanced", parenthesis = "unbalanced";
        for (char ch : chars) {
            if (ch == '[' || (ch == ']' && brackets.empty())) {
                brackets.push(ch);
            }
            if (ch == ']' && brackets.peek() != ']') {
                brackets.pop();
            }
            if (ch == '{' || (ch == '}' && braces.empty())) {
                braces.push(ch);
            }
            if (ch == '}' && braces.peek() != '}') {
                braces.pop();
            }
            if (ch == '(' || (ch == ')' && parentheses.empty())) {
                parentheses.push(ch);
            }
            if (ch == ')' && parentheses.peek() != ')') {
                parentheses.pop();
            }
        }
        if (brackets.empty()) {
            bracket = "balanced";
        }
        if (braces.empty()) {
            brace = "balanced";
        }
        if (parentheses.empty()) {
            parenthesis = "balanced";
        }
        System.out.println("For this String:\n" + s);
        System.out.println("Brackets are " + bracket + ".");
        System.out.println("Braces are " + brace + ".");
        System.out.println("Parentheses are " + parenthesis + ".");
    }
}
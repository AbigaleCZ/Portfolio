import java.util.*;
public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 7, 18, 22, 25, 30));
        int choice, position;
        System.out.println("Enter a value to find in the array of number:");
        choice = input.nextInt();
        position = BinarySearchDemo.search(array, choice);
        System.out.println(choice + " appears in this arry at position " + position + ".");
    }
}

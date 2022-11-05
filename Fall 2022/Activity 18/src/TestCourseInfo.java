import classArrayLists.CourseInfo;
import java.util.*;
public class TestCourseInfo {
    public static void main(String[] args) {
        CourseInfo term = new CourseInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first course for this term:");
        term.addEntry();
        int entries = 1;
        System.out.println("You have entered " + entries + " courses. Would you like to enter another? (Y/N)");
        String choice = input.nextLine();
        while (true) {
            if (choice.equals("y") || choice.equals("Y")) {
                term.addEntry();
                entries++;
                System.out.println("You have entered " + entries + " courses. Would you like to enter another? (Y/N)");
                choice = input.nextLine();
            }
            else if (choice.equals("n") || choice.equals("N")) {
                term.courseTable();
                System.out.println("Thank you for using the Course Info Table.");
                break;
            }
            else {
                System.out.println("That isn't a valid entry. Please type Y or N.");
                choice = input.nextLine();
            }
        }
    }
}

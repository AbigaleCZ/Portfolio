package classArrayLists;
import java.util.*;
public class CourseInfo {
    ArrayList<String> courses = new ArrayList<String>();
    ArrayList<Double> gpa = new ArrayList<Double>();
    ArrayList<Integer> scores = new ArrayList<Integer>();
    ArrayList<Character> grades = new ArrayList<Character>();
    Scanner input = new Scanner(System.in);
    public void addEntry() {
        System.out.println("Please enter a course code (such as CS 121):");
        String course = input.nextLine();
        while (course.length() < 10) {
            course += " ";
        }
        courses.add(course);
        System.out.println("Enter the GPA for this course:");
        double g = input.nextDouble();
        gpa.add(g);
        System.out.println("Please enter a score of this course:");
        int score = input.nextInt();
        scores.add(score);
        char grade = '?';
        if (score > 89) {
            grade = 'A';
        }
        else if (score > 79) {
            grade = 'B';
        }
        else if (score > 69) {
            grade = 'C';
        }
        else if (score > 59) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        grades.add(grade);
    }
    public void courseTable() {
        System.out.println("""
                Course     C P A  Score  Grade
                ------------------------------
                """);
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%s  %.3f  %-1d  %-2c\n", courses.get(i), gpa.get(i), scores.get(i), grades.get(i));
        }
    }
}

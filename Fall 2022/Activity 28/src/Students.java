import java.util.*;
public class Students {
    SortedSet<String> students = new TreeSet<>();
    Scanner input = new Scanner(System.in);
    public void addStudent() {
        System.out.println("Enter a student's name to add it to the list.\nYou can quit anytime by entering quit.");
        String entry = input.nextLine();
        while (true) {
            if (entry.equalsIgnoreCase("quit")) {
                break;
            }
            students.add(entry);
            System.out.println(entry + " successfully added to the list.");
            entry = input.nextLine();
        }
    }
    public void displayStudents() {
        Iterator<String> studentList = students.iterator();
        System.out.println("Students\n------------------------");
        while (studentList.hasNext()) {
            System.out.println(studentList.next());
        }
    }
}

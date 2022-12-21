import java.util.*;
public class Student {
    private String firstName, lastName, major, standing;
    private int id;
    private double gpa;
    private LinkedList<String> courseList = new LinkedList<>();
    public Student(String fName, String lName, String maj, String cls, int idn) {
        this.firstName = fName;
        this.lastName = lName;
        this.major = maj;
        this.standing = cls;
        this.id = idn;
    }
    public void addCourse(String crs) {
        courseList.add(crs);
    }
    public void removeCourse(int index) {
        courseList.remove(index);
    }
    public String getStudentInfo() {
        StringBuilder info = new StringBuilder();
        info.append("          Name: ").append(firstName).append(" ").append(lastName).append("\n            ID: ").append(id).append("\n         Major: ").append(major).append("\nClass Standing: ").append(standing);
        return info.toString();
    }
    public void displayCourses() {
        int i = 0;
        System.out.println("Courses\n------------");
        for (String c : courseList) {
            i++;
            System.out.println(i + ". " + c);
        }
    }
}

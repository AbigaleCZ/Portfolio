import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random num = new Random();
        Student student1 = new Student("Johnny","Bananas","Hospitality Innovation","Freshman",8765309);
        Student student2 = new Student("Sue","Smith","Political Science","Senior",5882300);
        student1.addCourse("BIO 110");
        student1.addCourse("PFW 100");
        student1.addCourse("HOSP 201");
        System.out.println(student1.getStudentInfo());
        student1.displayCourses();
        input.nextLine();
        student1.removeCourse(num.nextInt(3));
        student1.displayCourses();
        input.nextLine();
        student2.addCourse("POLI 304");
        student2.addCourse("HIST 106");
        student2.addCourse("REL 316");
        System.out.println(student2.getStudentInfo());
        student2.displayCourses();
        input.nextLine();
        student2.removeCourse(num.nextInt(3));
        student2.displayCourses();
    }
}

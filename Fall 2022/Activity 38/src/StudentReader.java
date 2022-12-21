import com.google.gson.*;
import java.io.*;
public class StudentReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader,Student.class);
            System.out.println("Student Details\n-------------------------------------");
            System.out.printf("""
                    Student Name : %s
                    Student ID   : %d
                    Student Major: %s
                    """, student.getName(), student.getID(), student.getMajor());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
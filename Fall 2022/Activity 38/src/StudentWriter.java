import com.google.gson.*;
import java.io.*;
public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student student = new Student("Sue Smith",5882300,"Political Science");
            Gson gson = new Gson();
            String jsonString = gson.toJson(student);
            FileWriter writer = new FileWriter("student.json");
            writer.write(jsonString);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class InputOutput {
    public static void main(String [] args) {
        File inputFile1 = new File("C:\Users\Admin\OneDrive - Ball State University\College\Semester 8\CS 121\Text.txt");
        File inputFile2 = new File("Text.txt");
        try{
            Scanner input = new Scanner(inputFile1);
            String header = input.nextLine();
            System.out.println(header);
            while (input.hasNextLine()) {
                int creds = input.nextInt();
                int score = input.nextInt();
            }
        input.close();
        }
        catch
    }
}

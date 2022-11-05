import java.util.*;
import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;
public class ArraysFromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dexNumber = new int[3], evolutions = new int[3];
        String[] speciesName = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of a Pokémon:");
            speciesName[i] = input.nextLine();
            System.out.printf("What is %s's Pokédex number?", speciesName[i]);
            dexNumber[i] = Integer.parseInt(input.nextLine());
            System.out.printf("How many evolutionary stages does %s have?", speciesName[i]);
            evolutions[i] = Integer.parseInt(input.nextLine());
            while (evolutions[i] < 0 || evolutions[i] > 2) {
                System.out.println("No Pokémon species has that many evolutionary stages.\nPlease enter a valid number from 0 to 2.");
                evolutions[i] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("""
                Here are the Pokémon you've entered:
                ---------------------
                No. Species    Stages
                """);
        for (int i = 0; i < 3; i++) {
            System.out.printf("""
                    
                    %d %s %d
                    """, dexNumber[i], speciesName[i], evolutions[i]);
        }
    }
}

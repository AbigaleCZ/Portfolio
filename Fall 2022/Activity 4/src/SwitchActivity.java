/* Name: Gale Sexton
Data Structures and Objects
Date: 9 Sep, 2022
***************************
This program creates a Scanner object and prompts the user to input
one of six Pokémon Types. The program uses a switch statement to
output the Type's weaknesses, resistances, strengths, Types resisted
by it, and Types against which it is ineffective.
 */
import java.util.Scanner;
public class SwitchActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Pokémon Type. Be sure to capitalize your entry. This program is a work in progress and currently supports Normal, Grass, Fire, Water, Electric, and Bug.");
        String type = input.nextLine();
        switch(type) {
            case "Normal":
                System.out.println("This Type is weak to Fighting, immune to Ghost, is resisted by Rock and Steel, and is ineffective against Ghost.");
                break;
            case "Grass":
                System.out.println("This Type is weak to Bug, Fire, Flying, Ice, and Poison;\nit resists Grass, Ground, and Water;\nit is strong against Ground, Rock, and Water;\nand it is resisted by Bug, Dragon, Grass, Fire, Flying, and Steel.");
                break;
            case "Fire":
                System.out.println("THis Type is weak to Ground, Rock, and Water;\nit resists Bug, Fairy, Fire, Grass, Ice, and Steel;\nit is strong against Bug, Grass, Ice, and Steel;\nand is resisted by Dragon, Fire, Rock, and Water.");
                break;
            case "Water":
                System.out.println("This Type is weak to Electirc and Grass;\nit resists Fire, Ice, Steel, and Water;\nit is strong against Fire, Ground, and Rock;\nand is resisted by Dragon, Grass, and Water.");
                break;
            case "Electric":
                System.out.println("This Type is weak to Ground;\nit resists Electric and Steel;\nit is strong against Flying and Water;\nis resisted by Dragon, Electric, and Grass;\nand is ineffective against Ground.");
                break;
            case "Bug":
                System.out.println("This Type is weak to Fire, Flying, and Rock;\nit resists Fighting, Grass, and Ground;\nis strong against Dark, Grass, and Psychic;\nand is resisted by Fairy, Fighting, Fire, Flying, Ghost, Poison, and Steel.");
                break;
            default:
                System.out.printf("%s is not a valid Type.", type);
                break;
        }
    }
}

/* Name: Gale Sexton
Data Structures and Objects
Date: 25 Sep, 2022
****************************
This program is designed to test the PKMN and PKMNMove classes
by creating an object for each class, as well as a Scanner object.
The program runs each of the methods for each class by having the
user input details foa a Pokémon and its first move.
 */
import java.util.Scanner;
public class CreatePKMN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PKMN pokémon = new PKMN();
        PKMNMove move1 = new PKMNMove();
        System.out.println("Welcome to the Pokémon Stat and Move Tester a;pha build!\nPlease enter the name of a Pokémon species.");
        pokémon.setSpecies(input.nextLine());
        System.out.println("Would you like to give " + pokémon.getSpecies() + " a nickname?");
        boolean choice = input.nextLine().equals("y") || input.nextLine().equals("yes") || input.nextLine().equals("Yes") || input.nextLine().equals("Y");
        if (choice) {
            pokémon.setNickname(input.nextLine());
        }
        else {
            pokémon.setNickname(pokémon.getSpecies());
        }
        System.out.printf("What is %s's type?", pokémon.getNickname());
        pokémon.setType1(input.nextLine());
        System.out.printf("Does %s have a second type?", pokémon.getNickname());
        choice = input.nextLine().equals("y") || input.nextLine().equals("Y") || input.nextLine().equals("yes") || input.nextLine().equals("Yes");
        if (choice) {
            pokémon.setType2(input.nextLine());
        }
        System.out.printf("What is %s's base HP stat?", pokémon.getNickname());
        pokémon.setHP(input.nextInt());
        System.out.printf("What is %s's base Attack stat?", pokémon.getNickname());
        pokémon.setAtk(input.nextInt());
        System.out.printf("What is %s's base Defense stat?", pokémon.getNickname());
        pokémon.setDef(input.nextInt());
        System.out.printf("What is %s's base Special Attack stat?", pokémon.getNickname());
        pokémon.setSAtk(input.nextInt());
        System.out.printf("What is %s's base Special Defense stat?", pokémon.getNickname());
        pokémon.setSDef(input.nextInt());
        System.out.printf("What is %s's base Speed stat?", pokémon.getNickname());
        pokémon.setSpd(input.nextInt());
        String name;
        if (pokémon.getSpecies().equals(pokémon.getNickname())) {
            name = pokémon.getSpecies();
        }
        else {
            name = pokémon.getNickname() + " (" + pokémon.getSpecies() + ")";
        }
        System.out.printf("""
                Here is the Pokémon you have created, assuming
                a Leve of 50, a neutral nature, 0 IVs, and
                0 EVs:
                
                %s
                
                HP:%-14d
                Attack:%-10d
                Defense:%-9d
                Special Attack:%-2d
                Special Defense:%-1d
                Speed:%-11d
                """, name, pokémon.getHP(), pokémon.getAttack(), pokémon.getDefense(), pokémon.getSpAttack(), pokémon.getSpDefense(), pokémon.getSpeed());
        System.out.printf("Please enter %s's first move.", pokémon.getNickname());
        move1.setMove(input.nextLine());
        System.out.printf("What type is %s?", move1.getName());
        move1.setType(input.nextLine());
        System.out.printf("What category is %s?", move1.getName());
        move1.setCategory(input.nextLine());
        System.out.printf("How many PP dows %s have?", move1.getName());
        move1.setPP(input.nextInt());
        System.out.printf("What is %s's power?", move1.getName());
        move1.setPower(input.nextInt());
        System.out.printf("What is %s's accuracy?", move1.getName());
        move1.setAccuracy(input.nextInt());
        System.out.printf("What effect(s) does %s have, if any?", move1.getName());
        move1.setDescription(input.nextLine());
        System.out.printf("""
                Here's the move you gave to %s:
                
                %s
                %s/%s
                
                PP:%-7d
                Power:%-4d
                Accuracy:%-1d
                
                %s
                """, pokémon.getNickname(), move1.getName(), move1.getType(), move1.getCategory(), move1.getPP(), move1.getPower(), move1.getAccuracy(), move1.getDescription());
    }
}

package pokémonData;
import java.util.*;
public class PokémonBattle {
    Scanner input = new Scanner(System.in);
    Random gen = new Random();
    private Pokédex dex = new Pokédex();
    public void registerPokémon() {
        while (true) {
            System.out.println("Type register to add a Pokémon to your Pokédex\nor quit to end this function:");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("register")) {
                createPokémon();
            }
            else if (choice.equalsIgnoreCase("quit")) {
                break;
            }
            else {
                System.out.print("Invalid entry.");
                input.nextLine();
            }
        }
    }
    public void createPokémon() {
        System.out.println("Enter a species of Pokémon:");
        String pSpecies = input.nextLine();
        System.out.println("Enter an HP score for " + pSpecies + ":");
        int pHP = Integer.parseInt(input.nextLine());
        System.out.println("Enter a Speed score for " + pSpecies + ":");
        int pSPD = Integer.parseInt(input.nextLine());
        System.out.println("This is the Pokémon you have created:\n\n" + pSpecies + "\nHP:    " + pHP + "\nSPeed: " + pSPD + "\n\nType accept to add this Pokémon.");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("accept")) {
            Pokémon pkmn = new Pokémon(pSpecies, pHP, pSPD);
            while (true) {
                System.out.println("Type teach to add a move to " + pSpecies + "'s move list\nor finish to register " + pSpecies + " to the Pokédex:");
                choice = input.nextLine();
                if (choice.equalsIgnoreCase("teach")) {
                    createMove(pkmn);
                }
                else if (choice.equalsIgnoreCase("finish")) {
                    break;
                }
                else {
                    System.out.println("Invalid entry. Please type teach or finish.");
                    input.nextLine();
                }
            }
            dex.addPokémon(pkmn);
            System.out.println(pSpecies + " was successfully registered to the Pokédex!");
        }
        else {
            createPokémon();
        }
    }
    public void createMove(Pokémon pkmn) {
        System.out.println("Enter the name of a move:");
        String mName = input.nextLine();
        System.out.println("Enter " + mName + "'s type:");
        String mType = input.nextLine();
        System.out.println("Enter " + mName + "'s power:");
        int mPower = Integer.parseInt(input.nextLine());
        System.out.println("Here's the move you created:\n\n" + mName + "\nType:  " + mType + "\nPower: " + mPower + "\n\nType accept to add this move to " + pkmn.getSpecies() + "'s move list.");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("accept")) {
            pkmn.addMove(mName, mType, mPower);
        }
        else {
            createMove(pkmn);
        }
    }
}

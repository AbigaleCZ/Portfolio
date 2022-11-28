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
                System.out.println("Enter your Pokémon's species:");
                String pSpecies = input.nextLine();
                System.out.println("Enter " + pSpecies + "'s HP score:");
                int pHP = Integer.parseInt(input.nextLine());
                System.out.println("Enter " + pSpecies + "'s Speed score:");
                int pSPD = Integer.parseInt(input.nextLine());
                System.out.println(pSpecies + "\n\nHP:    " + pHP + "\nSpeed: " + pSPD + "\n\nAre you satisfied with this entry?\nType accept to move on.");
                choice = input.nextLine();
                if (choice.equalsIgnoreCase("accept")) {
                    Pokémon pkmn = new Pokémon(pSpecies, pHP, pSPD);
                    dex.addPokémon();
                    while (true) {
                        System.out.println("Type teach to add a move to " + pSpecies + "'s' move list\nor accept to finalize its moveset.");
                        choice = input.nextLine();
                        if (choice.equalsIgnoreCase("teach")) {
                            System.out.println("Enter the name of a move:");
                            String mName = input.nextLine();
                            System.out.println("What is " + mName + "'s type?");
                            String mType = input.nextLine();
                            System.out.println("What is " + mName + "'s power?");
                            int mPower = Integer.parseInt(input.nextLine());
                            System.out.println("Here's the move you entered:\n\n" + mName + "\nType:  " + mType + "\nPower: " + mPower + "\n\nType accept to add to " + pSpecies + "'s move list.");
                            choice = input.nextLine();
                            if (choice.equalsIgnoreCase("accept")) {
                                Move move = new Move(mName, mType, mPower);
                                pkmn.addMove(move);
                            }
                        }
                        else if (choice.equalsIgnoreCase("accept")) {
                            break;
                        }
                        else {
                            System.out.println("Invalid entry.");
                            input.nextLine();
                        }
                    }
                }
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
}

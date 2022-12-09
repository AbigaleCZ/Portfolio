package pokémonData;
import java.util.*;
public class PokémonBattle {
    Scanner input = new Scanner(System.in);
    Random gen = new Random();
    private Pokédex dex = new Pokédex();
    private int playerIndex;
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
    public Pokémon getPlayerPokémon() {
        playerIndex = displayPokéList();
        return dex.selectPokémon(playerIndex);
    }
    public int displayPokéList() {
        ArrayList<Pokémon> list = dex.getPokéList();
        int i = 1, choice;
        String decision;
        for (Pokémon p : list) {
            System.out.println(i + ". " + p.getSpecies());
            i++;
        }
        System.out.println("\nType the number next to a Pokémon to see its information.");
        choice = Integer.parseInt(input.nextLine());
        Pokémon pkmn = dex.selectPokémon(choice);
        ArrayList<Move> mList = pkmn.getMoves();
        System.out.println(pkmn.getPokémonInfo() + "\n\nMoves:\n");
        for (Move m : mList) {
            System.out.println(m.getName() + " (Type: " + m.getType() + ", Power: " + m.getPower() + ")");
        }
        System.out.println("\nType continue to look at another Pokémon:");
        decision = input.nextLine();
        if (decision.equalsIgnoreCase("continue")) {
            displayPokéList();
        }
        return choice;
    }
    public Pokémon getCPUPokémon() {
        return dex.randomPokémon(playerIndex);
    }
    public void quickBattle(Pokémon player, Pokémon cpu) {
        String choice;
        ArrayList<Move> list = player.getMoves();
        System.out.println("Which move will " + player.getSpecies() + " use in this battle?\n");
        for (Move m : list) {
            System.out.println(m.getName() + " (Type: " + m.getType() + ", Power: " + m.getPower() + ")");
        }
        choice = input.nextLine();
        Move p1Move = player.getMoveByName(choice);
        String cpuName = dex.randomMove(cpu);
        Move cpuMove = cpu.getMoveByName(cpuName);
        System.out.println(player.getSpecies() + " vs. " + cpu.getSpecies() + "... START!");
        String winner = null, loser = null;
        int dmg = 0;
        double dmgFactor = 1.0;
        while (player.getHitPoints() > 0 && cpu.getHitPoints() > 0) {
            if (cpu.getSPD() > player.getSPD()) {
                dmgFactor = gen.nextDouble(0.85,1.01);
                dmg = (int) Math.round((22 * cpuMove.getPower() / 50 + 2) * dmgFactor);
                player.setHitPoints(dmg);
                if (player.getHitPoints() < 1) {
                    winner = cpu.getSpecies();
                    loser = player.getSpecies();
                }
                dmgFactor = gen.nextDouble(0.85,1.01);
                dmg = (int) Math.round((22 * p1Move.getPower() / 50 + 2) * dmgFactor);
                cpu.setHitPoints(dmg);
                if (cpu.getHitPoints() < 1) {
                    winner = player.getSpecies();
                    loser = cpu.getSpecies();
                }
            }
            else {
                dmgFactor = gen.nextDouble(0.85,1.01);
                dmg = (int) Math.round((22 * p1Move.getPower() / 50 + 2) * dmgFactor);
                cpu.setHitPoints(dmg);
                if (cpu.getHitPoints() < 1) {
                    winner = player.getSpecies();
                    loser = cpu.getSpecies();
                }
                dmgFactor = gen.nextDouble(0.85,1.01);
                dmg = (int) Math.round((22 * cpuMove.getPower() / 50 + 2) * dmgFactor);
                player.setHitPoints(dmg);
                if (player.getHitPoints() < 1) {
                    winner = cpu.getSpecies();
                    loser = player.getSpecies();
                }
            }
            System.out.println("Player   : " + player.getHitPoints() + "\nComputer: " + cpu.getHitPoints());
        }
        System.out.println(loser + " is unable to battle! The winner is " + winner + "!");
    }
}

import java.util.*;
public class PokémonSelection {
    Scanner input = new Scanner(System.in);
    private Pokémon createPokémon() {
        System.out.println("Enter your Pokémon's species:");
        String name = input.nextLine();
        System.out.printf("Enter %s's HP score:\n", name);
        int hpScore = Integer.parseInt(input.nextLine());
        System.out.printf("\nEnter %s's Speed score:\n", name);
        int spdScore = Integer.parseInt(input.nextLine());
        System.out.printf("\nEnter the move that %s will use:\n", name);
        String moveName = input.nextLine();
        System.out.printf("\nEnter %s's power:\n", moveName);
        int movePower = Integer.parseInt(input.nextLine());
        Pokémon pkmn = new Pokémon(name,moveName,hpScore,movePower,spdScore);
        System.out.println(pkmn.displayPokémonStats());
        input.nextLine();
        System.out.println("Are you satisfied with your inputs? Enter 'Y' to confirm:");
        String choice = input.nextLine();
        if (!choice.equalsIgnoreCase("y")) {
            createPokémon();
        }
        return pkmn;
    }
    public void assignPokémon() {
        System.out.println("Player 1, choose your Pokémon!");
        Pokémon pkmn1 = createPokémon();
        String p1Stats = pkmn1.displayPokémonStats();
        System.out.println("Player 2, choose your Pokémon!");
        Pokémon pkmn2 = createPokémon();
        String p2Stats = pkmn2.displayPokémonStats();
        System.out.println("Player 1's Pokémon\n----------------------");
        System.out.println(p1Stats);
        System.out.println("Player 2's Pokémon\n----------------------");
        System.out.println(p2Stats);
    }
}

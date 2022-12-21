import java.util.*;
public class Test {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Pokédex dex = new Pokédex();
        while (true) {
            System.out.println("Create Pokémon?");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                addPokémon(dex);
            }
            else {
                break;
            }
        }
        System.out.println(dex.getDex());
    }
    public static void addPokémon(Pokédex dex) {
        System.out.println("Pokémon species:");
        String species = input.nextLine();
        System.out.println(species + " HP:");
        int hp = Integer.parseInt(input.nextLine());
        System.out.println(species + " Speed:");
        int spd = Integer.parseInt(input.nextLine());
        dex.addPokémon(species, hp, spd);
    }
}
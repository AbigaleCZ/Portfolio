import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PKMN ditto = new PKMN();
        String species, nick, t1, t2;
        int hp, atk, def, sa, sd, spd, iv;
        System.out.println("To create a blank Pokémon template, simply enter a Pokémon species.");
        species = input.nextLine();
        PKMN pkmn = new PKMN(species);
        System.out.println("""
                Now, let's create a full Pokémon.
                Go ahead and give it a nickname!
                """);
        nick = input.nextLine();
        System.out.printf("Enter %s's first type.", nick);
        t1 = input.nextLine();
        System.out.printf("Enter %s's second type. Enter 'null' if it doesn't have one.", nick);
        t2 = input.nextLine();
        System.out.printf("Enter %s's HP stat.", nick);
        hp = Integer.parseInt(input.nextLine());
        System.out.printf("Enter %s's Attack stat.", nick);
        atk = Integer.parseInt(input.nextLine());
        System.out.printf("Enter %s's Defense stat.", nick);
        def = Integer.parseInt(input.nextLine());
        System.out.printf("Enter %s's Special Attack stat.", nick);
        sa = Integer.parseInt(input.nextLine());
        System.out.printf("Enter %s's Special Defense stat.", nick);
        sd = Integer.parseInt(input.nextLine());
        System.out.printf("Enter %s's Speed stat.", nick);
        spd = Integer.parseInt(input.nextLine());
        PKMN fullpkmn = new PKMN(species, nick, t1, t2, hp, atk, def, sa, sd, spd);
        System.out.printf("%s's HP at Level 50 with 0 IVs is %d.\nWhy not give it some IVs?\nEnter a number from 0 to 31.", nick, fullpkmn.getHP());
        iv = Integer.parseInt(input.nextLine());
        while (iv < 0 || iv > 31) {
            System.out.println("That isn't a valid number. Try again.");
            iv = Integer.parseInt(input.nextLine());
        }
        System.out.printf("%s's HP at Level 50 with the IVs you entered is %d.", nick, fullpkmn.getHP(iv));
    }
}

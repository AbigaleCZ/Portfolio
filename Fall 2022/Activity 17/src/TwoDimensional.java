import java.util.*;
public class TwoDimensional {
    public static void main(String[] args) {
        String[][] team = new String[6][3];
        String[] type2 = {"Ghost", "Fire", "Water", "Grass", "Ice", "Flying"};
        for (int p = 0; p < 6; p++) {
            team[p][0] = "Rotom";
            team[p][1] = "Electric";
        }
        for (int t = 0; t < 6; t++) {
            team[t][2] = type2[t];
        }
        System.out.println("A team of perfect Pokémon:");
        for (String[] p : team) {
            System.out.printf("%s (%s/%s)\n", p[0], p[1], p[2]);
        }
    }
}

import java.util.*;
public class Pokédex {
    ArrayList<Pokémon> dex = new ArrayList<>();
    public void addPokémon(String species, int hp, int spd) {
        Pokémon pkmn = new Pokémon(species, hp, spd);
        dex.add(pkmn);
    }
    public String getDex() {
        StringBuilder str = new StringBuilder("Pokédex\n---------------------");
        for (Pokémon p : dex) {
            str.append("\n\n").append(p.getPokémonInfo());
        }
        return str.toString();
    }
}
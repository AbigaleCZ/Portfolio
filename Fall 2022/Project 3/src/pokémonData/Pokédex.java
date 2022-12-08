package pokémonData;
import java.util.*;
public class Pokédex {
    private ArrayList<Pokémon> pokéList = new ArrayList<>();
    Random gen = new Random();
    public void addPokémon(Pokémon pkmn) {
        pokéList.add(pkmn);
    }
    public ArrayList<Pokémon> getPokéList() {
        return pokéList;
    }
    public Pokémon selectPokémon(int pick) {
        pick--;
        return pokéList.get(pick);
    }
    public Pokémon randomPokémon(int picked) {
        int index = gen.nextInt(pokéList.size());
        while (index == picked - 1) {
            index = gen.nextInt(pokéList.size());
        }
        return pokéList.get(index);
    }
    public String randomMove(Pokémon pkmn) {
        int num = gen.nextInt(pkmn.getMoveListSize());
        return pkmn.getMoveName(num);
    }
}

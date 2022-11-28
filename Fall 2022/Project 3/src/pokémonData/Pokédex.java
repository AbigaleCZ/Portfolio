package pokémonData;
import java.util.*;
public class Pokédex {
    private ArrayList<Pokémon> pokéList = new ArrayList<>();
    Random gen = new Random();
    public void addPokémon(String pSpecies, itn pHP, int pSPD) {
        Pokémon pkmn = new Pokémon(pSpecies, pHP, pSPD);
        pokéList.add(pkmn);
    }
    public String getPokéList() {
        StringBuilder list = new StringBuilder("Available Pokémon:\n");
        int i = 0;
        for (Pokémon p : pokéList) {
            i++;
            list.append("\n").append(i + ". " + p.getSpecies());
        }
        return list.toString();
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

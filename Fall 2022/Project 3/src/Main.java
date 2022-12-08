import java.util.*;
import pokémonData.*;
public class Main {
    public static void main(String[] args) {
        PokémonBattle sim = new PokémonBattle();
        sim.registerPokémon();
        Pokémon player = sim.getPlayerPokémon();
        Pokémon cpu = sim.getCPUPokémon();
        sim.quickBattle(player, cpu);
    }
}

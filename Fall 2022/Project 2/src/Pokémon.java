public class Pokémon {
    public Pokémon() {
        species = "Ditto";
        hp = 45;
        spd = 45;
        move = "Transform";
        power = 1;
    }
    public Pokémon(String name, String moveName, int hpScore, int movePower, int spdScore) {
        species = name;
        move = moveName;
        hp = hpScore;
        spd = spdScore;
        power = movePower;
    }
    private String species, move;
    private int hp, spd, power;
    public void setSpecies(String name) {
        species = name;
    }
    public void setMove(String moveName) {
        move = moveName;
    }
    public void setHP(int hpScore) {
        hp = hpScore;
    }
    public void setSPD(int spdScore) {
        spd = spdScore;
    }
    public void setPower(int movePower) {
        power = movePower;
    }
    public String getSpecies() {
        return species;
    }
    public String getMove() {
        return move;
    }
    public int getHP() {
        return hp + 60;
    }
    public int getSPD() {
        return spd + 5;
    }
    public int getPower() {
        return power;
    }
    public String displayPokémonStats() {
        StringBuilder stats = new StringBuilder();
        stats.append(getSpecies()).append("\n");
        stats.append("HP:    ").append(getHP()).append("\n");
        stats.append("Speed: ").append(getSPD()).append("\n");
        stats.append("Move:  ").append(getMove()).append("\n");
        stats.append("Power: ").append(getPower());
        return stats.toString();
    }
}

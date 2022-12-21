import java.util.*;
public class Pokémon {
    Scanner input = new Scanner(System.in);
    Random gen = new Random();
    private String species;
    private int hp, currentHP, maxHP, spd;
    private ArrayList<Move> moveList = new ArrayList<>();
    public Pokémon(String pSpecies, int pHP, int pSPD) {
        this.species = pSpecies;
        this.hp = pHP;
        this.maxHP = hp + gen.nextInt(16) + 60;
        this.currentHP = maxHP;
        this.spd = pSPD + gen.nextInt(16) + 5;
    }
    public void addMove(String mName, String mType, int mPower) {
        Move move = new Move(mName, mType, mPower);
        if (moveList.size() == 4) {
            int i = 0, choice;
            System.out.println(species + " already knows four moves:\n");
            for (Move m : moveList) {
                i++;
                System.out.println(i + ". " + m.getName());
            }
            System.out.println("\nWhich would you like to replace?");
            choice = Integer.parseInt(input.nextLine());
            while (choice < 1 || choice > 4) {
                System.out.println("Please enter a number between 1 and 4:");
                choice = Integer.parseInt(input.nextLine());
            }
            choice--;
            System.out.println(moveList.get(choice).getName() + " was forgotten.");
            moveList.remove(choice);
            moveList.add(move);
        }
        else {
            moveList.add(move);
        }
        System.out.println(species + " learned " + mName + "!");
    }
    public void setHitPoints(int dmg) {
        currentHP -= dmg;
    }
    public void resetHitPoints() {
        currentHP = maxHP;
    }
    public String getSpecies() {
        return species;
    }
    public int getHitPoints() {
        return currentHP;
    }
    public int getSPD() {
        return spd;
    }
    public String getPokémonInfo() {
        return species + "\n\nHit Points: " + currentHP + " / " + maxHP + "\nSpeed:      " + spd;
    }
    public int getMoveListSize() {
        return moveList.size();
    }
   public String getMoveName(int num) {
        return moveList.get(num).getName();
    }
    public ArrayList<Move> getMoves() {
        return moveList;
    }
    public Move getMoveByName(String mName) {
        int i = -1, n = 0;
        for (Move m : moveList) {
            i++;
            if (mName.equalsIgnoreCase(m.getName())) {
                n = i;
            }
        }
        return moveList.get(n);
    }
}
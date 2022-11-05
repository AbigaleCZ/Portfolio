/* Name: Gale Sexton
Data Structures and Objects
Date: 25 Sep, 2022
***************************
This class creates a Pokémon object in a program; this
object contains fields for a Pokémon's species, nickname,
and base stats. Its methods can be used to set these fields'
values and to calculate the final stats for the Pokémon,
assuming a Level of 50, no IVs, and no EVs.
 */
public class PKMN {
    public PKMN() {
        this.name = "Ditto";
        this.nickName = name;
        this.type1 = "Normal";
        this.type2 = null;
        this.baseHP = 45;
        this.baseAttack = 45;
        this.baseDefense = 45;
        this.baseSpAttack = 45;
        this.baseSpDefense = 45;
        this.baseSpeed = 45;
    }
    public PKMN(String species, String nick, String t1, String t2, int hp, int atk, int def, int satk, int sdef, int spd) {
        this.name = species;
        this.nickName = nick;
        this.type1 = t1;
        this.type2 = t2;
        this.baseHP = hp;
        this.baseAttack = atk;
        this.baseDefense = def;
        this.baseSpAttack = satk;
        this.baseSpDefense = sdef;
        this.baseSpeed = spd;
    }
    private String name, nickName, type1, type2;
    private int baseHP, baseAttack, baseDefense, baseSpAttack, baseSpDefense, baseSpeed;
    public void setSpecies(String species) {
        this.name = species;
    }
    public void setNickname(String nick) {
        this.nickName = nick;
    }
    public void setType1(String t1) {
        this.type1 = t1;
    }
    public void setType2(String t2) {
        this.type2 = t2;
    }
    public void setHP(int h) {
        this.baseHP = h;
    }
    public void setAtk(int a) {
        this.baseAttack = a;
    }
    public void setDef(int d) {
        this.baseDefense = d;
    }
    public void setSAtk(int sa) {
        this.baseSpAttack = sa;
    }
    public void setSDef(int sd) {
        this.baseSpDefense = sd;
    }
    public void setSpd(int s) {
        this.baseSpeed = s;
    }
    public String getSpecies() {
        return this.name;
    }
    public String getNickname() {
        return this.nickName;
    }
    public String getType1() {
        return this.type1;
    }
    public String getType2() {
        return this.type2;
    }
    public int getHP() {
        return this.baseHP + 60;
    }
    public int getAttack() {
        return this.baseAttack + 5;
    }
    public int getDefense() {
        return this.baseDefense + 5;
    }
    public int getSpAttack() {
        return this.baseSpAttack + 5;
    }
    public int getSpDefense() {
        return this.baseSpDefense + 5;
    }
    public int getSpeed() {
        return this.baseSpeed + 5;
    }
}

package inheritance;
import java.util.*;
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
    Scanner input = new Scanner(System.in);
    protected String name, nickName, names, type1, type2, types, basicInfo;
    protected int baseHP, baseAttack, baseDefense, baseSpAttack, baseSpDefense, baseSpeed;
    public void setSpecies() {
        System.out.println("Enter your Pokémon'species:");
        name = input.nextLine();
        if (!nickName.equals(name) && nickName.equals("Ditto")) {
            nickName = name;
        }
    }
    public void setNickname() {
        System.out.println("Enter " + nickName + "'s nickname:");
        nickName = input.nextLine();
    }
    public void setType1() {
        System.out.println("Enter " + nickName + "'s primary type:");
        type1 = input.nextLine();
    }
    public void setType2() {
        System.out.println("Enter " + nickName + "'s secondary type:");
        type2 = input.nextLine();
    }
    public void setHP() {
        System.out.println("Enter " + nickName + "'s base HP stat:");
        baseHP = input.nextInt();
    }
    public void setAtk() {
        System.out.println("Enter " + nickName + "'s base Attack stat:");
        baseAttack = input.nextInt();
    }
    public void setDef() {
        System.out.println("Enter " + nickName + "'s base Defense stat:");
        baseDefense = input.nextInt();
    }
    public void setSAtk() {
        System.out.println("Enter " + nickName + "'s base Special Attack stat:");
        baseSpAttack = input.nextInt();
    }
    public void setSDef() {
        System.out.println("Enter " + nickName + "'s base Special Defense stat:");
        baseSpDefense = input.nextInt();
    }
    public void setSpd() {
        System.out.println("Enter " + nickName + "'s base Speed stat:");
        baseSpeed = input.nextInt();
    }
    public String getBasicInfo() {
        if (nickName.equals(name)) {
            names = name;
        }
        else {
            names = nickName + " (" + name + ")";
        }
        if (type2.equals(null)) {
            types = type1;
        }
        else {
            types = type1 + "/" + type2;
        }
        basicInfo = names + "\n" + types + "\n\n" + "HP:             " + baseHP + "\nAttack:         " + baseAttack + "\nDefense:        " + baseDefense + "\nSpecial Attack:  " + baseSpAttack + "\nSpecial Defense: " + baseSpDefense + "\nSpeed:           " + baseSpeed;
        return basicInfo;
    }

}

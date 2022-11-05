package inheritance;
import java.util.Random;
import java.util.Scanner;
public class Charmander extends PKMN {
    public Charmander() {
        name = "Charmander";
        nickName = "Charmander";
        type1 = "Fire";
        type2 = null;
        sex = genSex();
        ability = genAbility();
        level = 1;
        baseHP = 39;
        hpIV = genIV();
        baseAttack = 52;
        atkIV = genIV();
        baseDefense = 43;
        defIV = genIV();
        baseSpAttack = 60;
        satkIV = genIV();
        baseSpDefense = 50;
        sdefIV = genIV();
        baseSpeed = 65;
        spdIV = genIV();
        finalStats();
    }
    Random gen = new Random();
    Scanner input = new Scanner(System.in);
    private String sex, ability;
    private int level, finalHP, finalAttack, finalDefense, finalSpAttack, finalSpDefense, finalSpeed, hpIV, atkIV, defIV, satkIV, sdefIV, spdIV;
    public void setSex() {
        System.out.println("Is " + nickName + " male or female?");
        String choice = input.nextLine();
        while (!choice.equalsIgnoreCase("male") && !choice.equalsIgnoreCase("female")) {
            System.out.println("Sorry, Pokémon species currently operate on the binary.\n" + nickName + " must either be male or female.");
            choice = input.nextLine();
        }
        sex = choice;
    }
    public void setAbility() {
        System.out.println("Is " + nickName + "'s Ability Blaze or Solar Power?");
        String choice = input.nextLine();
        while (!choice.equalsIgnoreCase("blaze") && !choice.equalsIgnoreCase("solar power")) {
            System.out.println("Blaze and Solar Power are the only choices for " + nickName + "'s Ability.");
            choice = input.nextLine();
        }
        ability = choice;
    }
    public void setLevel() {
        System.out.println("From 1 to 100, what is " + nickName + "'s Level?");
        int choice = input.nextInt();
        while (choice < 1 || choice > 100) {
            System.out.println("A Pokémon's Level must be between 1 and 100.");
            choice = input.nextInt();
        }
        level = choice;
        finalStats();
    }
    public void setHPIV() {
        System.out.println("Give " + nickName + " an IV value for its HP stat between 0 and 31.");
        int choice = input.nextInt();
        while (choice < 0 || choice > 31) {
            System.out.println("Your value needs to be between 0 and 31.");
            choice = input.nextInt();
        }
        hpIV = choice;
        finalStats();
    }
    public void setAttackIV() {
        System.out.println("Give " + nickName + " an IV value for its Attack stat between 0 and 31.");
        int choice = input.nextInt();
        while (choice < 0 || choice > 31) {
            System.out.println("Your value needs to be between 0 and 31.");
            choice = input.nextInt();
        }
        atkIV = choice;
        finalStats();
    }
    public void setDefenseIV() {
        System.out.println("Give " + nickName + " an IV value for its Defense stat between 0 and 31.");
        int choice = input.nextInt();
        while (choice < 0 || choice > 31) {
            System.out.println("Your value needs to be between 0 and 31.");
            choice = input.nextInt();
        }
        defIV = choice;
        finalStats();
    }
    public void setSpAttackIV() {
        System.out.println("Give " + nickName + " an IV value for its Special Attack stat between 0 and 31.");
        int choice = input.nextInt();
        while (choice < 0 || choice > 31) {
            System.out.println("Your value needs to be between 0 and 31.");
            choice = input.nextInt();
        }
        satkIV = choice;
        finalStats();
    }
    public void setSpDefenseIV() {
        System.out.println("Give " + nickName + " an IV value for its Special Defense stat between 0 and 31.");
        int choice = input.nextInt();
        while (choice < 0 || choice > 31) {
            System.out.println("Your value needs to be between 0 and 31.");
            choice = input.nextInt();
        }
        sdefIV = choice;
        finalStats();
    }
    public void setSpeedIV() {
        System.out.println("Give " + nickName + " an IV value for its Speed stat between 0 and 31.");
        int choice = input.nextInt();
        while (choice < 0 || choice > 31) {
            System.out.println("Your value needs to be between 0 and 31.");
            choice = input.nextInt();
        }
        spdIV = choice;
        finalStats();
    }
    public String getMoreInfo() {
        char marker;
        if (nickName.equals(name)) {
            names = name;
        }
        else {
            names = nickName + " (" + name + ")";
        }
        if (sex.equalsIgnoreCase("male")) {
            marker = '♂';
        }
        else {
            marker = '♀';
        }
        return names + " " + marker + "\n" + level + "\n" + type1 + "\n" + ability + "\n\nHP:              " + finalHP + "\nAttack:          " + finalAttack + "\nDefense:         " + finalDefense + "\nSpecial Attack:  " + finalSpAttack + "\nSpecial Defense: " + finalSpDefense + "\nSpeed:           " + finalSpeed;
    }
    private String genSex() {
        String result;
        int chance = gen.nextInt(1, 8);
        if (chance == 8) {
            result = "Female";
        }
        else {
            result = "Male";
        }
        return result;
    }
    private String genAbility() {
        String result;
        int chance = gen.nextInt(1, 20);
        if (chance > 18) {
            result = "Solar Power";
        }
        else {
            result = "Blaze";
        }
        return result;
    }
    private int genIV() {
        int iv = gen.nextInt(31);
        return iv;
    }
    private void finalStats() {
        finalHP = Math.round((2 * (baseHP + hpIV) * level / 100) + level + 10);
        finalAttack = Math.round((2 * (baseAttack + atkIV) * level / 100) + 5);
        finalDefense = Math.round((2 * (baseDefense + defIV) * level / 100) + 5);
        finalSpAttack = Math.round((2 * (baseSpAttack + satkIV) * level / 100) + 5);
        finalSpDefense = Math.round((2 * (baseSpDefense + sdefIV) * level / 100) + 5);
        finalSpeed = Math.round((2 * (baseSpeed + spdIV) * level / 100) + 5);
    }
}

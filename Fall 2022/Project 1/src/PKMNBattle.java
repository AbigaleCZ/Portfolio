/* Name: Gale Sexton
Data Structures and Objects
Date: 25 Sep. 2022
***************************
This program creates a Scanner and a Random object. It then asks
the users to enter an odd number of rounds and creates a for loop
the runs for each round. Each loop has each of the two users to
enter the name, HP, and Speed of a Pokémon, as well as the name of
a move and the move's power. Using a while loop. the program
determines which Pokémon goes first in each exchange based on the
speed of each species, using the Random object to break ties by
adding a decimal value between 0.00000 and 1. The first Pokémon
to reach 0 hit points breaks the loop, declaring the other
player's Pokémon the winner and adding a win to the player's
total. After the for loop is fully complete, the program
compares the wins of each player and declares a final winner.
 */
import java.util.Random;
import java.util.Scanner;
public class PKMNBattle {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int rounds, HP, p1HitPoints, p2HitPoints, p1Power, p2Power, speed, p1Speed, p2Speed, p1Wins = 0, p2Wins = 0;
        double p1Init, p2Init, damage, damageRange;
        String p1PKMN, p2PKMN, p1Move, p2Move;
        System.out.println("Welcome to the Pokémon Battle Simulator's Alpha test!\nIn this program, two players enter Pokémon stats to see who\nwould win a battle. Please enter an odd number of rounds:");
        rounds = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= rounds; i++) {
            System.out.println("Player 1, please choose your Pokémon!");
            p1PKMN = input.nextLine();
            System.out.printf("What is the HP stat for %s?\n", p1PKMN);
            HP = Integer.parseInt(input.nextLine());
            p1HitPoints = HP + 60;
            System.out.printf("What is the Speed stat for %s?\n", p1PKMN);
            speed = Integer.parseInt(input.nextLine());
            p1Speed = speed + 5;
            System.out.printf("Which move will %s be using?\n", p1PKMN);
            p1Move = input.nextLine();
            System.out.printf("What is %s's power?\n", p1Move);
            p1Power = Integer.parseInt(input.nextLine());
            System.out.println("Player 2, please choose your Pokémon!");
            p2PKMN = input.nextLine();
            System.out.printf("What is the HP stat for %s?\n", p2PKMN);
            HP = Integer.parseInt(input.nextLine());
            p2HitPoints = HP + 60;
            System.out.printf("What is the Speed stat for %s?\n", p2PKMN);
            speed = Integer.parseInt(input.nextLine());
            p2Speed = speed + 5;
            System.out.printf("Which move will %s be using?\n", p2PKMN);
            p2Move = input.nextLine();
            System.out.printf("What is %s's power?\n", p2Move);
            p2Power = Integer.parseInt(input.nextLine());
            System.out.printf("Round %d, START!\n", i);
            p1Init = p1Speed;
            p2Init = p2Speed;
            while (true) {
                if (p1Speed == p2Speed) {
                    p1Init = p1Speed + random.nextDouble(0.00000,1.00000);
                    p2Init = p2Speed + random.nextDouble(0.00000, 1.00000);
                }
                if (p1Speed > p2Speed || p1Init > p2Init) {
                    damageRange = random.nextDouble(0.85, 1.00);
                    damage = Math.round((22.0 * p1Power / 50 + 2) * damageRange);
                    p2HitPoints -= damage;
                    if (p2HitPoints <=0) {
                        System.out.printf("Player 1's %s wins Round %d!\n------------------------------------\n", p1PKMN, i);
                        p1Wins ++;
                        break;
                    }
                    damageRange = random.nextDouble(0.85,1.00);
                    damage = Math.round((22.0 * p2Power / 50 + 2) * damageRange);
                    p1HitPoints -= damage;
                    if (p1HitPoints <= 0) {
                        System.out.printf("Player 2's %s wins Round %d!\n------------------------------------\n", p2PKMN, i);
                        p2Wins ++;
                        break;
                    }
                }
                else {
                    damageRange = random.nextDouble(0.85,1.00);
                    damage = Math.round((22.0 * p2Power / 50 + 2) * damageRange);
                    p1HitPoints -= damage;
                    if (p1HitPoints <= 0) {
                        System.out.printf("Player 2's %s wins Round %d!\n------------------------------------\n", p2PKMN, i);
                        p2Wins ++;
                        break;
                    }
                    damageRange = random.nextDouble(0.85, 1.00);
                    damage = Math.round((22.0 * p1Power / 50 + 2) * damageRange);
                    p2HitPoints -= damage;
                    if (p2HitPoints <= 0) {
                        System.out.printf("Player 1's %s wins Round %d!\n------------------------------------\n", p1PKMN, i);
                        p1Wins ++;
                        break;
                    }
                }
                p1Init = p1Speed;
                p2Init = p2Speed;
            }
        }
        System.out.printf("Player 1 has %d wins, and Player 2 has %d.\n", p1Wins, p2Wins);
        if (p1Wins > p2Wins) {
            System.out.println("Player 1 wins!");
        }
        else {
            System.out.println("Player 2 wins!");
        }
    }
}

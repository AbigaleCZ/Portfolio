package generators.dice;
import java.util.*;
public class Die {
    Random die = new Random();
    protected int sides = 0;
    public int roll(int d) {
        int r = 0;
        for (int i = 0; i < d; i++) {
            r += die.nextInt(1, sides + 1);
        }
        return r;
    }
    public int rollExplode(int d) {
        int r = 0;
        for (int i = 0; i < d; i++) {
            int l = roll(1);
            if (l == sides) {
                d++;
            }
            r++;
        }
        return r;
    }
    public int successOver(int d, int t) {
        int r = 0;
        for (int i = 0; i < d; i++) {
            if (roll(1) >= t) {
                r++;
            }
        }
        return r;
    }
    public int successOverExplode(int d, int t) {
        int r = 0;
        for (int i = 0; i < d; i++) {
            int l = roll(1);
            if (l == sides) {
                d++;
            }
            if (l >= t) {
                r++;
            }
        }
        return r;
    }
    public int successUnder(int d, int t) {
        int r = 0;
        for (int i = 0; i < d; i++) {
            if (roll(1) <= t) {
                r++;
            }
        }
        return r;
    }
    public int successUnderExplode(int d, int t) {
        int r = 0;
        for (int i = 0; i < d; i++) {
            int l = roll(1);
            if (l == 1) {
                d++;
            }
            if (l <= t) {
                r++;
            }
        }
        return r;
    }
}

package generators.dice;
public class Df extends Die {
    public Df() {
        sides = -1;
    }
    public int roll(int d) {
        int r = 0;
        for (int i = 0; i < d; i++) {
            r += die.nextInt(sides,2);
        }
        return r;
    }
}

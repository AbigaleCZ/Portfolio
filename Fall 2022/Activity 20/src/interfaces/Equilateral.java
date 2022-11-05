package interfaces;
public class Equilateral implements Triangle {
    private int side;
    public void setSide(int s) {
        side = s;
    }
    public int getSides() {
        return side;
    }
    public int getPerimeter() {
        return side * 3;
    }
}

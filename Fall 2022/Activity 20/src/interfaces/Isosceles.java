package interfaces;
public class Isosceles implements Triangle {
    private int side1, side2;
    public void setSides(int s1, int s2) {
        side1 = s1;
        side2 = s2;
    }
    public int getSide1() {
        return side1;
    }
    public int getSide2() {
        return side2;
    }
    public int getPerimeter() {
        return side1 * 2 + side2;
    }
}

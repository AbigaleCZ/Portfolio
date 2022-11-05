import interfaces.*;
public class TestInterfaces {
    public static void main(String[] args) {
        Equilateral qlt = new Equilateral();
        Isosceles isc = new Isosceles();
        qlt.setSide(5);
        System.out.println("Each side of the equlateral tringle is " + qlt.getSides());
        System.out.println("The equilateral triangle's perimeter is " + qlt.getPerimeter());
        isc.setSides(2, 4);
        System.out.println("The equal sides of the isosceles triangle are each " + isc.getSide1() +
                "\nand the third side is " + isc.getSide2());
        System.out.println("The isosceles triangle's perimeter is " + isc.getPerimeter());
    }
}

package Ch10.Rectangle;

public class TestRectangle {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7);
        Rectangle r3 = new Rectangle(3, 4);
        Rectangle r4 = new Rectangle(10, 9);
        System.out.println(r1.isSquare());
        System.out.println(r2.isSquare());
        System.out.println(r3.isSquare());
        System.out.println(r4.isSquare());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        r1.quadratize();
        r2.quadratize();
        r3.quadratize();
        r4.quadratize();
        System.out.println(r1.isSquare());
        System.out.println(r2.isSquare());
        System.out.println(r3.isSquare());
        System.out.println(r4.isSquare());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
    }
}
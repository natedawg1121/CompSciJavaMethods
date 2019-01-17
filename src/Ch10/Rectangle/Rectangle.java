package Ch10.Rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        if (w > 0 && h > 0) {
            width = w;
            height = h;
        } else {
            throw new IllegalArgumentException("Height or width is not valid");
        }
    }

    public Rectangle(int wh) {
        if (wh > 0) {
            width = wh;
            height = wh;
        } else {
            throw new IllegalArgumentException("Height or width is not valid");
        }
    }

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public boolean isSquare() {
        return(width == height);
    }

    public void quadratize() {
        int smack = (int)(Math.sqrt((width * height)) + 0.5);
        width = smack;
        height = smack;
        System.out.println("Rectangle successfully quadratized");
    }

    public String toString() {
        return ("[ " + width + " , " + height + " ]");
    }
}
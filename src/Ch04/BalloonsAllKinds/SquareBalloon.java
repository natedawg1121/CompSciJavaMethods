package Ch04.BalloonsAllKinds;

import java.awt.Color;
import java.awt.Graphics;
import Ch04.BalloonDraw.Balloon;

public class SquareBalloon extends Balloon {
public SquareBalloon() {
}

public SquareBalloon(int x, int y, int r, Color c) {
    super(x, y, r, c);
}

public double distance(int x, int y) {
    double dx = (double)Math.abs(x - this.getX());
    double dy = (double)Math.abs(y - this.getY());
    return Math.max(dx, dy);
}

public void draw(Graphics g, boolean makeItFilled) {
    g.setColor(this.getColor());
    int r = this.getRadius();
    int x = this.getX();
    int y = this.getY();
    if (makeItFilled) {
        g.fillRect(x - r, y - r, 2 * r, 2 * r);
    } else {
        g.drawRect(x - r, y - r, 2 * r, 2 * r);
    }

}
}
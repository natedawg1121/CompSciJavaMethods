package Ch04.BalloonsAllKinds;

import java.awt.Color;
import java.awt.Graphics;
import Ch04.BalloonDraw.Balloon;

public class FancyBalloon extends Balloon {
public FancyBalloon() {
}

public FancyBalloon(int x, int y, int r, Color c) {
    super(x, y, r, c);
}

public double distance(int x, int y) {
    double dx = (double)(x - this.getX());
    double dy = (double)(y - this.getY());
    return Math.min(Math.sqrt(4.0D * dx * dx + dy * dy), Math.sqrt(dx * dx + 4.0D * dy * dy));
}

public void draw(Graphics g, boolean makeItFilled) {
    int r = this.getRadius();
    int x = this.getX();
    int y = this.getY();
    Color c = this.getColor();
    if (makeItFilled) {
        g.setColor(c);
        g.fillOval(x - r / 2, y - r, r, 2 * r);
        g.setColor(new Color(c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha() / 2));
        g.fillOval(x - r, y - r / 2, 2 * r, r);
    } else {
        g.setColor(c);
        g.drawOval(x - r / 2, y - r, r, 2 * r);
        g.drawOval(x - r, y - r / 2, 2 * r, r);
    }

}
}

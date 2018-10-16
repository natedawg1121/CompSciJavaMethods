package Ch04.BalloonsAllKinds;

import java.awt.Color;
import java.awt.Graphics;
import Ch04.BalloonDraw.Balloon;

public class OvalBalloon extends Balloon {
public OvalBalloon() {
}

public OvalBalloon(int x, int y, int r, Color c) {
    super(x, y, r, c);
}

public double distance(int x, int y) {
    double dx = (double)(x - this.getX());
    double dy = (double)(y - this.getY());
    return Math.sqrt(4.0D * dx * dx + dy * dy);
}

public void draw(Graphics g, boolean makeItFilled) {
    g.setColor(this.getColor());
    int r = this.getRadius();
    int x = this.getX();
    int y = this.getY();
    if (makeItFilled) {
        g.fillOval(x - r / 2, y - r, r, 2 * r);
    } else {
        g.drawOval(x - r / 2, y - r, r, 2 * r);
    }

}
}

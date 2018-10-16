package Ch04.BalloonsAllKinds;

import java.awt.Color;
import java.awt.Graphics;
import Ch04.BalloonDraw.Balloon;

public class RoundBalloon extends Balloon {
public RoundBalloon() {
}

public RoundBalloon(int x, int y, int r, Color c) {
    super(x, y, r, c);
}

public void draw(Graphics g, boolean makeItFilled) {
    g.setColor(this.getColor());
    int r = this.getRadius();
    int x = this.getX();
    int y = this.getY();
    if (makeItFilled) {
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
    } else {
        g.drawOval(x - r, y - r, 2 * r, 2 * r);
    }

}
}
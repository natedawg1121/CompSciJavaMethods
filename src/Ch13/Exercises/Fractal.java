package Ch13.Exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fractal extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTriangles(g, 100, 80, 64);
    }

    private void drawTriangles(Graphics g, int x, int y, int r) {
        int s = 0;
        int temp = r;
        while (temp > 0) {
            s += temp;
            temp /= 2;
        }
        g.drawLine(x, y - s, x - r, y - s + r);
        g.drawLine(x, y - s, x + r, y - s + r);
        if (r / 2 != 0) {
            drawTriangles(g, x - r, y, r / 2);
            drawTriangles(g, x + r, y, r / 2);
        }
    }

    public static void main(String[] args) {
        JFrame w = new JFrame("Triangles");
        w.setBounds(300, 300, 200, 120);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fractal panel = new Fractal();
        panel.setBackground(Color.WHITE);
        Container c = w.getContentPane();
        c.add(panel);
        w.setResizable(false);
        w.setVisible(true);
    }
}
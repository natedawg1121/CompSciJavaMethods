package Ch02.HelloGui;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Ch04.BalloonDraw.Balloon;

public class Banner extends JPanel implements ActionListener {
  private int xPos, yPos;  // hold the coordinates of the message
  
  private static int b1XP = 100; // Balloon1 stuff
  private static int b1YP = 420;
  private static int r1 = 50;
  private static Color c1 = Color.PINK;
  
  private static int b2XP = 250; // Balloon2 stuff
  private static int b2YP = 490;
  private static int r2 = 40;
  private static Color c2 = Color.GREEN;
  
  private static int b3XP = 400; // Balloon3 stuff
  private static int b3YP = 460;
  private static int r3 = 45;
  private static Color c3 = Color.CYAN;
  
  // Instantiate some new balloons
  Balloon b1 = new Balloon(b1XP, b1YP, r1, c1);
  Balloon b2 = new Balloon(b2XP, b2YP, r2, c2);
  Balloon b3 = new Balloon(b3XP, b3YP, r3, c3);

  // Called automatically after a repaint request
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g); // Paint the background
    g.setColor(Color.YELLOW);
    g.drawString("IT'S A PARTY!", xPos, yPos);
    
    b1.draw(g, true);
    b2.draw(g, true);
    b3.draw(g, true);
  }

  // Called automatically when the timer "fires"
  public void actionPerformed(ActionEvent e)
  {
    // Adjust the horizontal position of the message:
    xPos--;  // subtract 1
    if (xPos < -100)
      xPos = getWidth();
    
    b1YP = b1YP - 3;
    b1.move(b1XP, b1YP);
    if (b1YP < -50) {
    	b1YP = 420;
    	b1.move(b1XP, b1YP);
    }

    b2YP--;
    b2.move(b2XP, b2YP);
    if (b2YP < -50) {
    	b2YP = 490;
    	b2.move(b2XP, b2YP);
    }
    
    b3YP = b3YP - 2;
    b3.move(b3XP, b3YP);
    if (b3YP < -50) {
    	b3YP = 460;
    	b3.move(b3XP, b3YP);
    }

    repaint();
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Banner.java");

    // Set this window's location and size:
    // upper-left corner at 300, 300; width 300, height 100
    window.setBounds(150, 150, 600, 400);

    //  Create panel, a Banner object, which is a kind of JPanel:
    Banner panel = new Banner();
    panel.setBackground(Color.DARK_GRAY);  // the default color is light gray

    // Add panel to window:
    Container c = window.getContentPane();
    c.add(panel);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    // Set the initial position of the message:
    panel.xPos = panel.getWidth();
    panel.yPos = panel.getHeight() / 2;

    // Create a Timer object that fires every 30 milliseconds;
    // attach it to panel so that panel "listens to" and
    // processes the timer events; start the timer:
    Timer clock = new Timer(30, panel);
    clock.start();
  }
}

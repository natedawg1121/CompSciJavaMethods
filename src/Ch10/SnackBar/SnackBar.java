package Ch10.SnackBar;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SnackBar extends JFrame implements ActionListener {
    //private static final String MY_PASSWORD = "jinx";
    private VendingMachine[] machines;

    private SnackBar() {
        super("Snack Bar");
        ImageIcon coin = new ImageIcon("coin.gif");
        Color brandColor1 = new Color(130, 30, 10);
        Color brandColor2 = new Color(255, 180, 0);
        Color brandColor3 = new Color(90, 180, 0);
        VendingMachine[] machines = new VendingMachine[]{new VendingMachine("Java", brandColor1, 45, coin), new VendingMachine("JApple", brandColor2, 50, coin), new VendingMachine("Jinx", brandColor3, 35, coin)};
        this.machines = machines;
        int w = machines.length * 205;
        int h = 310;
        this.setMinimumSize(new Dimension(w, h));
        Box wall = Box.createHorizontalBox();
        wall.add(Box.createHorizontalStrut(5));
        VendingMachine[] arr$ = machines;

        for(VendingMachine i$ : arr$) {
            VendingMachine machine = i$;
            wall.add(machine);
            wall.add(Box.createHorizontalStrut(5));
        }

        JPanel service = new JPanel();
        service.add(new JLabel(" Service login: "));
        JPasswordField password = new JPasswordField("", 5);
        password.addActionListener(this);
        service.add(password);
        Container c = this.getContentPane();
        c.setBackground(Color.GRAY);
        c.add(wall, "Center");
        c.add(service, "South");
    }

    public void actionPerformed(ActionEvent e) {
        JPasswordField password = (JPasswordField)e.getSource();
        String word = new String(password.getPassword());
        password.setText("");
        if ("jinx".equals(word)) {
            VendingMachine[] arr$ = this.machines;

            for(VendingMachine i$ : arr$) {
                VendingMachine machine = i$;
                machine.reload();
            }

            JOptionPane.showMessageDialog(null, "Machines reloaded", "Service", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Login failed", "Service", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SnackBar window = new SnackBar();
        window.setLocation(50, 50);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
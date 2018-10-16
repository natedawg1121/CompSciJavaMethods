package Ch04.BalloonsAllKinds;

import Ch04.BalloonsAllKinds.DrawingPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
    private DrawingPanel canvas;
    private JButton colorButton;
    private JButton colorDisplay;
    private JComboBox<String> chooseBalloonShape;

    public ControlPanel(DrawingPanel canvas) {
        this.canvas = canvas;
        this.colorButton = new JButton("Pick Color");
        this.colorButton.addActionListener(new ControlPanel.ColorButtonListener());
        this.colorDisplay = new JButton();
        this.colorDisplay.setBackground(canvas.getColor());
        this.colorDisplay.setEnabled(false);
        String[] balloonShapeNames = new String[]{"Round", "Oval", "Square", "Fancy"};
        this.chooseBalloonShape = new JComboBox(balloonShapeNames);
        this.chooseBalloonShape.addActionListener(new ControlPanel.BalloonButtonListener());
        this.add(this.colorButton);
        this.add(this.colorDisplay);
        this.add(this.chooseBalloonShape);
    }

    private class BalloonButtonListener implements ActionListener {
        private BalloonButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.canvas.addBalloon(ControlPanel.this.chooseBalloonShape.getSelectedIndex() + 1);
            ControlPanel.this.canvas.requestFocus();
        }
    }

    private class ColorButtonListener implements ActionListener {
        private ColorButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            ControlPanel.this.canvas.pickColor();
            ControlPanel.this.colorDisplay.setBackground(ControlPanel.this.canvas.getColor());
            ControlPanel.this.canvas.requestFocus();
        }
    }
}
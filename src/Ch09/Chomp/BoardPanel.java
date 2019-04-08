package Ch09.Chomp;

/**
 * A board for the Chomp program
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BoardPanel extends JPanel {
    private static final int ROWS = 3, COLS = 6;   // board dimensions
    private static int cellWidth, cellHeight;
    private final Color chocolate = new Color(110, 70, 50);

    private int tentativeRow, tentativeCol, displayCount;

    // Constructor
    public BoardPanel() {
        setPreferredSize(new Dimension(COLS * 40, ROWS * 40));
        setBackground(Color.LIGHT_GRAY);
    }

    public BoardPanel(int cellW, int cellH) {
        cellWidth = cellW;
        cellHeight = cellH;
        setPreferredSize(new Dimension(COLS * cellW, ROWS * cellH));
        setBackground(Color.LIGHT_GRAY);
    }

    // Returns the number of rows in the board
    public int numRows() {
        return ROWS;
    }

    // Returns the number of columns in the board
    public int numCols() {
        return COLS;
    }

    // Returns the location that corresponds to the x,y-coordinates
    // of the mouse click on the board
    public Location getPos(int x, int y, JPanel p) {
        return new Location(y / (p.getHeight() / ROWS), x / (p.getWidth() / COLS));
    }

    // Sets location for the expected move at row, col
    // (to provide visual feedback, e.g. flashing the changed squares)
    public void setMove(int row, int col) {
        tentativeRow = row;
        tentativeCol = col;
    }

    // Sets count for visual feedback, e.g. flashing the changed squares
    public void setDisplayCount(int count) {
        displayCount = count;
    }

    private ChompGame game;

    // Repaints the board after the move at row, col
    public void update(ChompGame game) {
        this.game = game;
        repaint();
    }

    public static void updateCellDimensions(BoardPanel bp) {
        cellWidth = (bp.getWidth() / COLS);
        cellHeight = (bp.getHeight() / ROWS);
    }

    // Displays the board after a repaint request
    // (redefines the method of the base class)
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (game == null)
            return;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                Color color;

                if (game.isEmpty(r, c))
                    color = Color.LIGHT_GRAY;
                else if (displayCount % 2 != 0 && r >= tentativeRow && c >= tentativeCol)
                    color = Color.RED;
                else
                    color = chocolate;
                g.setColor(color);
                int x = c * cellWidth;
                int y = r * cellHeight;
                g.fillRect(x, y, cellWidth, cellHeight);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, cellWidth, cellHeight);
                g.drawRect(x + 1, y + 1, cellWidth - 2, cellHeight - 2);
                if (r == 0 && c == 0) {
                    g.setColor(Color.YELLOW);
                    g.drawLine(x + 3, y + 3, x + cellWidth - 6, y + cellHeight - 6);
                    g.drawLine(x + 3, y + cellWidth - 6, x + cellHeight - 6, y + 3);
                }
            }
        }

        if (displayCount > 0)
            displayCount--;
    }
}
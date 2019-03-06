package ACSL;

import javax.swing.*;
import java.util.*;

public class Stretch {
    private static ArrayList<String> gib;
    private static ArrayList<String> gibJr;
    private static int[][] grid;
    private static int sCell;
    private static int rows, cols;

    public static void main(String[] args) {
        collectData();
        popInAGrid();
        fitEmIn();
    }

    private static void collectData() {
        gib = new ArrayList<>();
        gibJr = new ArrayList<>();
        gib.add(JOptionPane.showInputDialog("Enter number of rows: "));
        gib.add(JOptionPane.showInputDialog("Enter number of columns: "));
        gib.add(JOptionPane.showInputDialog("Enter starting cell: "));
        gib.add(JOptionPane.showInputDialog("Enter number of blocked cells: "));
        for (int i = 0; i < Integer.parseInt(gib.get(3)); i++) {
            gibJr.add(JOptionPane.showInputDialog("Enter blocked cell " + (i + 1) + ": "));
        }
    }

    private static void popInAGrid() {
        rows = Integer.parseInt(gib.get(0));
        cols = Integer.parseInt(gib.get(1));
        grid = new int[rows][cols];
        int row = 1;
        int col = 1;
        for (int i = 1; i <= rows * cols; i++) {
            grid[row - 1][col - 1] = i;

            for (String knap : gibJr) {
                if (Integer.parseInt(knap) == i) {
                    grid[row - 1][col - 1] = 0;
                }
            }

            col++;

            if (col > cols) {
                row++;
                col = 1;
            }
        }

        sCell = Integer.parseInt(gib.get(2));
    }

    private static void fitEmIn() {
        ArrayList<String> aufWiedersehen = new ArrayList<>();
        int nCell = sCell;
        int nextPiece = 1;

        if (sCell % cols == 1) {
            int InRow = ((nCell - (nCell - 1) % cols) / cols);
            int InCol = (nCell % cols) - 1;
            int nRow = ((nCell - nCell % cols) / cols) + 1;
            int nCol = (nCell % cols);

            while (nCol != 0) {
                if (nCol < cols - 2 && grid[InRow][InCol + 1] != 0 && grid[InRow][InCol + 2] != 0 && nextPiece == 1) {
                    aufWiedersehen.add("A");
                    System.out.print("A");
                    nextPiece++;
                    nCell += 3;
                } else if (nRow < rows - 2 && grid[InRow + 1][InCol] != 0 && grid[InRow + 2][InCol] != 0 && nextPiece == 2) {
                    aufWiedersehen.add("DB");
                    System.out.print("B");
                    nextPiece++;
                    nCell += 21;
                } else if (nRow > 2 && grid[InRow - 1][InCol] != 0 && grid[InRow - 2][InCol] != 0 && nextPiece == 2) {
                    aufWiedersehen.add("UB");
                    System.out.print("B");
                    nextPiece++;
                    nCell -= 19;
                } else if (nCol < cols - 1 && nRow < rows - 1 && grid[InRow + 1][InCol] != 0 && grid[InRow + 1][InCol + 1] != 0 && nextPiece == 3 && !aufWiedersehen.get(aufWiedersehen.size() - 1).equals("UB")) {
                    aufWiedersehen.add("C");
                    System.out.print("C");
                    nextPiece++;
                    nCell += 12;
                } else if (nCol < cols - 1 && nRow < rows - 2 && grid[InRow][InCol + 1] != 0 && grid[InRow + 1][InCol + 1] != 0 && grid[InRow + 2][InCol + 1] != 0 && nextPiece == 4) {
                    aufWiedersehen.add("D");
                    System.out.print("D");
                    nextPiece++;
                    nCell += 22;
                } else if (nCol < cols - 1 && nRow < rows - 1 && grid[InRow][InCol + 1] != 0 && grid[InRow + 1][InCol + 1] != 0 && grid[InRow + 1][InCol + 2] != 0 && nextPiece == 5) {
                    aufWiedersehen.add("E");
                    System.out.print("E");
                    nextPiece = 1;
                    nCell += 12;
                } else {
                    nextPiece++;
                    if (nextPiece == 6)
                        nextPiece = 1;
                }

                InRow = ((nCell - nCell % cols) / cols);
                InCol = (nCell % cols) - 1;
                nRow = ((nCell - nCell % cols) / cols) + 1;
                nCol = (nCell % cols);
            }
        } else if (sCell % cols == 0) {
            int InRow = ((nCell - nCell % cols) / cols);
            int InCol = cols - 1;
            int nRow = ((nCell - nCell % cols) / cols) + 1;
            int nCol = cols;

            while (nCol > 1) {
                if (nCol > 2 && grid[InRow][InCol - 1] != 0 && grid[InRow][InCol - 2] != 0 && nextPiece == 1) {
                    aufWiedersehen.add("A");
                    System.out.print("A");
                    nextPiece++;
                    nCell -= 3;
                } else if (nRow < rows - 2 && grid[InRow + 1][InCol] != 0 && grid[InRow + 2][InCol] != 0 && nextPiece == 2) {
                    aufWiedersehen.add("DB");
                    System.out.print("B");
                    nextPiece++;
                    nCell += 19;
                } else if (nRow > 2 && grid[InRow - 1][InCol] != 0 && grid[InRow - 2][InCol] != 0 && nextPiece == 2) {
                    aufWiedersehen.add("UB");
                    System.out.print("B");
                    nextPiece++;
                    nCell -= 21;
                } else if (nRow > 1 && grid[InRow][InCol - 1] != 0 && grid[InRow - 1][InCol - 1] != 0 && nextPiece == 3 && !aufWiedersehen.get(aufWiedersehen.size() - 1).equals("DB")) {
                    aufWiedersehen.add("C");
                    System.out.print("C");
                    nextPiece++;
                    nCell -= 12;
                } else if (nRow > 2 && grid[InRow][InCol - 1] != 0 && grid[InRow - 2][InCol] != 0 && grid[InRow - 2][InCol - 1] != 0 && nextPiece == 4) {
                    aufWiedersehen.add("D");
                    System.out.print("D");
                    nextPiece++;
                    nCell -= 22;
                } else if (nRow > 1 && nCol > 2 && grid[InRow][InCol - 1] != 0 && grid[InRow - 1][InCol - 1] != 0 && grid[InRow - 1][InCol - 2] != 0 && nextPiece == 5) {
                    aufWiedersehen.add("E");
                    System.out.print("E");
                    nextPiece = 1;
                    nCell -= 12;
                } else {
                    nextPiece++;
                    if (nextPiece == 6)
                        nextPiece = 1;
                }

                InRow = ((nCell - nCell % cols) / cols);
                InCol = (nCell % cols) - 1;
                nRow = ((nCell - nCell % cols) / cols) + 1;
                nCol = (nCell % cols);
            }
        }
    }
}
package Ch09.Chomp;

public class CharMatrix {
    public final char SPACE = ' ';
    private char[][] grid;

    public CharMatrix(int rows, int cols) {
        this.grid = new char[rows][cols];
        this.fillRect(0, 0, rows - 1, cols - 1, ' ');
    }

    public CharMatrix(int rows, int cols, char fill) {
        this.grid = new char[rows][cols];
        this.fillRect(0, 0, rows - 1, cols - 1, fill);
    }

    public int numRows() {
        return this.grid.length;
    }

    public int numCols() {
        return this.grid[0].length;
    }

    public char charAt(int row, int col) {
        return this.grid[row][col];
    }

    public void setCharAt(int row, int col, char ch) {
        this.grid[row][col] = ch;
    }

    public boolean isEmpty(int row, int col) {
        return this.charAt(row, col) == ' ';
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for(int r = row0; r <= row1; ++r)
            for(int c = col0; c <= col1; ++c)
                this.setCharAt(r, c, fill);
    }

    public void clearRect(int row0, int col0, int row1, int col1) {
        this.fillRect(row0, col0, row1, col1, ' ');
    }

    public int countInRow(int row) {
        int count = 0;
        for(int c = 0; c < this.numCols(); ++c)
            if (!this.isEmpty(row, c))
                ++count;
        return count;
    }

    public int countInCol(int col) {
        int count = 0;
        for(int r = 0; r < this.numRows(); ++r)
            if (!this.isEmpty(r, col))
                ++count;
        return count;
    }
}
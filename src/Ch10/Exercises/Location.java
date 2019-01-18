package Ch10.Exercises;

public class Location {
    private int row;
    private int col;

    public Location(int r, int c) {
        row = r;
        col = c;
    }

    public Location(Location loc) {
        row = loc.getRow();
        col = loc.getCol();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int r) {
        row = r;
    }

    public void setCol(int c) {
        col = c;
    }

    public String toString() {
        return "(" + row + "," + col + ")";
    }

    static double pythagoreanDistance(Location loc1, Location loc2) {
        return (Math.sqrt(Math.pow((Math.abs((double)loc1.getRow() - (double)loc2.getRow())), 2)
                + Math.pow((Math.abs((double)loc1.getCol() - (double)loc2.getCol())), 2)));
    }

    static int distance(Location loc1, Location loc2) {
        int noot = 0;
        int r = loc1.getRow(), c = loc1.getCol();
        while (true) {
            int i = r - loc2.getRow();
            int j = c - loc2.getCol();
            if (i > 0 && j > 0) {
                r--;
                c--;
            } else if (i < 0 && j < 0) {
                r++;
                c++;
            } else if (i > 0 && j < 0) {
                r--;
                c++;
            } else if (i < 0 && j > 0) {
                r++;
                c--;
            } else if (i > 0) {
                r--;
            } else if (i < 0) {
                r++;
            } else if (j > 0) {
                c--;
            } else if (j < 0) {
                c++;
            } else {
                break;
            }
            noot++;
        }
        return noot;
    }
}
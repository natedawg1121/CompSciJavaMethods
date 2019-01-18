package Ch10.Exercises;

public class Location {
    private int row;
    private int col;

    public Location(int r, int c) {
        row = r;
        col = c;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String toString() {
        return "(" + row + "," + col + ")";
    }

    static double distance(Location loc1, Location loc2) {
        return (Math.sqrt(Math.pow((Math.abs((double)loc1.getRow() - (double)loc2.getRow())), 2)
                + Math.pow((Math.abs((double)loc1.getCol() - (double)loc2.getCol())), 2)));
    }
}
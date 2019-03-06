package Ch10.Exercises;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input loc1 row: ");
        int row1 = gib.nextInt();
        System.out.print("Input loc1 col: ");
        int col1 = gib.nextInt();
        System.out.print("Input loc2 row: ");
        int row2 = gib.nextInt();
        System.out.print("Input loc2 col: ");
        int col2 = gib.nextInt();
        Location location1 = new Location(row1, col1);
        Location location2 = new Location(row2, col2);
        System.out.println("The distance between " + location1.toString() + " and " + location2.toString() + " is: " + Location.distance(location1, location2));
    }
}
package Ch06;

import java.util.Scanner;

    public class LeapYear {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);

        System.out.print("Enter the year you would like to test: ");
        int cYear = gib.nextInt();

        System.out.println();  // blank line

        System.out.println(isLeapYear(cYear));
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
    }

}

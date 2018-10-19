package Ch06;

import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);

        System.out.println("Enter the first date");
        System.out.println("--------------------");
        System.out.print("Month: ");
        int month1 = gib.nextInt();
        System.out.print("Day: ");
        int day1 = gib.nextInt();
        System.out.print("Year: ");
        int year1 = gib.nextInt();

        System.out.println("Enter the second date");
        System.out.println("---------------------");
        System.out.print("Month: ");
        int month2 = gib.nextInt();
        System.out.print("Day: ");
        int day2 = gib.nextInt();
        System.out.print("Year: ");
        int year2 = gib.nextInt();

        gib.close();

        System.out.println();

        String msg = month1 + "/" + day1 + "/" + year1;
        if (isLater(month1, day1, year1, month2, day2, year2))
            msg += " IS ";
        else
            msg += " is NOT ";
        msg += "later than " + month2 + "/" + day2 + "/" + year2;
        System.out.println(msg);
    }

    private static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
        return (year1 > year2) || (year1 == year2 && month1 > month2) || (year1 == year2 && month1 == month2 && day1 > day2);
    }
}
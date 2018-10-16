package Ch00;

import java.util.Scanner;

public class FindDOW {
	public static Scanner gib = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input first day of the year: ");
		final String firstDay = gib.nextLine() ;
		System.out.print("Input desired date: ");
		final int currentDay = gib.nextInt();
		gib.close();
		if(currentDay < 0) {
			System.out.println("This is not a valid day input!");
		} else if(currentDay > 31) {
			System.out.println("This is not a valid day input!");
		} else {
			if(firstDay == "sun") {
				int offsetDay = currentDay - 1;
				int dayOfWeek1 = offsetDay % 7;
				System.out.println(dayOfWeek1);
			} else if(firstDay == "mon") {
				int offsetDay = currentDay;
				int dayOfWeek1 = offsetDay % 7;
				System.out.println(dayOfWeek1);
			} else if(firstDay == "tue") {
				int offsetDay = currentDay + 1;
				int dayOfWeek1 = offsetDay % 7;
				System.out.println(dayOfWeek1);
			} else if(firstDay == "wed") {
				int offsetDay = currentDay + 2;
				int dayOfWeek1 = offsetDay % 7;
				System.out.println(dayOfWeek1);
			} else if(firstDay == "thu") {
				int offsetDay = currentDay + 3;
				int dayOfWeek1 = offsetDay % 7;
				System.out.println(dayOfWeek1);
			} else if(firstDay == "fri") {
				int offsetDay = currentDay + 4;
				int dayOfWeek1 = offsetDay % 7;
				System.out.println(dayOfWeek1);
			} else if(firstDay == "sat") {
				int offsetDay = currentDay + 5;
				int dayOfWeek1 = offsetDay % 7;
				System.out.println(dayOfWeek1);
			} else {
				System.out.println("This is not a valid day input!");
			}
		}
	}
}
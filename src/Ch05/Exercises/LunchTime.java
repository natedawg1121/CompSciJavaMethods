package Ch05.Exercises;

import java.util.Scanner;

public class LunchTime {
	public static Scanner gib = new Scanner(System.in);
	public static boolean errorL = true;
	public static int uhr, minut;
	
	public static void main(String[] args) {
		while (errorL == true) {
			errorL = false;
			System.out.print("Input current hour: ");
			uhr = gib.nextInt();
			if ((uhr > 12) || (uhr < 1)) {
				System.out.println("This is not a valid hour input!");
				errorL = true;
			}
		}
		errorL = true;
		while (errorL == true) {
			errorL = false;
			System.out.print("Input current minute: ");
			minut = gib.nextInt();
			if ((minut > 59) || (minut < 0)) {
				System.out.println("This is not a valid minute input!");
				errorL = true;
			}
		}
		System.out.println("You have " + minutesUntilLunch(uhr, minut) + " minutes to lunch!");
	}

	public static int minutesUntilLunch(int hour, int minute) {
		return (((12 - hour) * 60) + (60- minute));
	}
}
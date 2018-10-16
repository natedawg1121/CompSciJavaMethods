package Ch05.Exercises;

import java.util.Scanner;

public class IntSwitch {

	public static void main(String[] args) {
		int num;
		String numS;
		System.out.print("Input integer: ");
		Scanner gib = new Scanner(System.in);
		num = gib.nextInt();
		gib.close();
		if (num < 10) {
			System.out.println(num * 10);
		} else if (num % 10 == 0) {
			System.out.println("0" + num / 10);
		} else {
			numS = String.valueOf(num);
			System.out.println(numS.substring(0,numS.length() - 2) + numS.substring(numS.length() - 1) + numS.substring(numS.length() - 2,numS.length() - 1));
		}
	}
}
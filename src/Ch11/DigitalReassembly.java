package Ch11;

import java.util.*;

public class DigitalReassembly {
	private static int[] data = new int[50];
	public static void main(String[] args) {
		Random rand = new Random();
		// Generate random integer in range 1 to 50
		int rand_int1 = rand.nextInt(50) + 1;

	    for(int i = 0; i < rand_int1; i++) {
		   data[i] = rand.nextInt(100) + 1;
	    }

		//Insert or Delete one element
		Scanner insDel = new Scanner(System.in);
		System.out.print("Insert or Delete? ");
		String answer = insDel.next();
	}
}
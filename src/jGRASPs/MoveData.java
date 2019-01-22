import java.util.*;

public class MoveData {
	static int[] data = new int[50];
	public static void main(String args[]) {
		Random rand = new Random();
  
		// Generate random integer in range 1 to 50
		int rand_int1 = rand.nextInt(50) + 1;

		for(int i=0; i<rand_int1; i++) {
			data[i] = rand.nextInt(100) + 1;
		}

		//Insert or Delete one element
		Scanner insDel = new Scanner(System.in);  
		System.out.print("Insert or Delete? ");    
		String answer = insDel.next(); 

		//if (answer.equals("insert")==true)
		//insert one random integer in the range of 1-100 as the last non-zero element of the array
		//else
		//Ask the user to for the index to remove
		//Shift all data.  No blanks or gaps in the data set.
	}
}


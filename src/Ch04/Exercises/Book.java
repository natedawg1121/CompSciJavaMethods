package Ch04.Exercises;

import java.awt.Color;

public class Book {
	public static int numPages, currentPage;
	
	public Book(int x, int y)
	  {
	    numPages = x;
	    currentPage = y;
	  }

	public static void turnPage() {
		if (currentPage < numPages) {
			currentPage++;
		}
	}
}

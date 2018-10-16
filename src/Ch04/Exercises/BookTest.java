package Ch04.Exercises;

import Ch04.Exercises.Book;

public class BookTest {

	public static void main(String[] args) {
		Book mobyDick = new Book(3, 1);
		
		Book.turnPage();
		System.out.println(Book.currentPage);
		Book.turnPage();
		System.out.println(Book.currentPage);
		Book.turnPage();
		System.out.println(Book.currentPage);
	}
}

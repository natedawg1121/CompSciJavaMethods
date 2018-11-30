package Ch08;

import java.util.Scanner;

public class ISBNCheck {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input ISBN: ");
        String hab = gib.next();
        System.out.println(isValidISBN(hab));
    }

    public static boolean isValidISBN(String isbn) {
        int sum = 0;
        if(isbn.length() != 13)
            return false;
        for (int i = 0; i < isbn.length(); i++) {
            if (!Character.isDigit(isbn.charAt(i)))
                return false;
            if (i % 2 == 0)
                sum += Integer.parseInt(isbn.substring(i, i+1));
            else
                sum += Integer.parseInt(isbn.substring(i, i+1)) * 3;
        }

        return(sum % 10 == 0);
    }
}
package Ch08;

import java.util.Scanner;

public class AllDigitsInString {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input: ");
        String hab = gib.next();
        System.out.println(istNumber(hab));
    }

    public static boolean istNumber(String string) {
        for (int i = 0; i < string.length(); i++)
            if (!Character.isDigit(string.charAt(i)))
                return false;
        return true;
    }
}
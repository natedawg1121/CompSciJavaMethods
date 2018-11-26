package Ch08;

import java.util.Scanner;

public class UpgradedPalindromeCheck {

    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input: ");
        String hab = gib.next();
        System.out.println(istPalindrom(hab));
    }

    private static boolean istPalindrom (String noot){
        String bigBoy = noot.replaceAll("[^A-Za-z0-9]", "");
        bigBoy = bigBoy.toLowerCase();
//        System.out.println(bigBoy);
//        System.out.println(reverseReverse(bigBoy));
        return bigBoy.equals(reverseReverse(bigBoy));
    }

    private static String reverseReverse (String yote){
        String reverse = "";
        for (int i = yote.length() - 1; i >= 0; i--) {
            reverse += yote.charAt(i);
        }
        return reverse;
    }
}
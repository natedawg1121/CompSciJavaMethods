package Ch13.CodingBat;
import java.util.Scanner;

public class StringClean {
    public static Scanner gib = new Scanner(System.in);

    private static String stringClean(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public static void main(String... args) {
        System.out.print("Input String: ");
        String noot = gib.next();
        System.out.println("\n" + stringClean(noot));
    }
}
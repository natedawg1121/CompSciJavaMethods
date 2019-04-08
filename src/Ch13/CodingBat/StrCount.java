package Ch13.CodingBat;
import java.util.Scanner;

public class StrCount {
    public static Scanner gib = new Scanner(System.in);

    private static int strCount(String str, String sub) {
        if (str.length() < sub.length())
            return 0;
        if (str.substring(0, sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }

    public static void main(String... args) {
        System.out.print("Input Base String: ");
        String noot = gib.next();
        System.out.println("Input Searched String: ");
        String yeet = gib.next();
        System.out.println("\n" + strCount(noot, yeet));
    }
}
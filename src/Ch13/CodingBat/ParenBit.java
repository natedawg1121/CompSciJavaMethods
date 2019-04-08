package Ch13.CodingBat;
import java.util.Scanner;

public class ParenBit {
    public static Scanner gib = new Scanner(System.in);

    private static String parenBit(String str) {
        if (!str.substring(0, 1).equals("("))
            return parenBit(str.substring(1));
        return (str.substring(0, str.indexOf(")") + 1));
    }

    public static void main(String... args) {
        System.out.print("Input String: ");
        String noot = gib.next();
        System.out.println("\n" + parenBit(noot));
    }
}
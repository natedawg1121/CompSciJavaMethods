package Ch08;

import java.util.Scanner;

public class MyStringMethods {

    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input string: ");
        String x = gib.next();
        System.out.println(hyperText(x));
//        System.out.print("Input starting char check: ");
//        String y = gib.next();
//        System.out.println(startsWith(x, y.charAt(0)));
//        System.out.print("Input ending char check: ");
//        String z = gib.next();
//        System.out.println(endsWith(x, z.charAt(0)));
    }

    private static boolean startsWith(String s, char c) {
        return s.charAt(0)==c;
    }

    private static boolean endsWith(String s, char c) {
        return s.charAt(s.length() - 1) == c;
    }

    private static String hyperText(String s) {
        String fin;
        if (s.indexOf("/*") < s.indexOf("*/")) {
            fin = s.substring(0, s.indexOf("/*"));
            fin += s.substring(s.indexOf("*/") + 2);
        } else {
            fin = s;
        }
        return fin;
    }
}
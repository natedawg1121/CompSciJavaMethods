package Ch08;

import java.util.Scanner;

public class DelAllWithin {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input string: ");
        String x = gib.next();
        delThoseChars(x);
    }

    private static void delThoseChars(String s) {
        String fin;
        if (s.indexOf("/*") < s.indexOf("*/")) {
            fin = s.substring(0, s.indexOf("/*"));
            fin += s.substring(s.indexOf("*/") + 2);
        } else {
            fin = s;
        }
        System.out.println(fin);
    }
}
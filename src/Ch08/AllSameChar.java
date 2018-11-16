package Ch08;

import java.util.Scanner;

public class AllSameChar {

    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input string: ");
        String x = gib.next();
        System.out.println(returnyBoi(x));
    }
    public static boolean returnyBoi(String s) {
        return s.chars().distinct().count() == 1;
    }
}
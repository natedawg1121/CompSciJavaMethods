package Ch08;

import java.util.Scanner;

public class TestCompareTo {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input 1: ");
        String n1 = gib.next();
        System.out.print("Input 2: ");
        String n2 = gib.next();
        System.out.println("n1 - n2 = " + (Integer.parseInt(n1) - Integer.parseInt(n2)));
        System.out.println("n1.compareTo(n2) = " + n1.compareTo(n2));
    }
}
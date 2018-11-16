package Ch07;

import java.util.Scanner;
import java.util.ArrayList;

//Closest to golden ratio = 1.61764705882
public class FractionPrint {
    private static ArrayList<Integer> hab = new ArrayList<>(2);

    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = gib.nextInt();
        hab.add(1);
        hab.add(1);
        for (int i = 2; i < x + 1; i++) {
            hab.ensureCapacity(i + 1);
            hab.add(hab.get(hab.size() - 1) + hab.get(hab.size() - 2));
        }
        System.out.println(hab.get(0));
        for (int j = 1; j < x; j++) {
            System.out.println(hab.get(j + 1) + " / " + hab.get(j));
        }
    }
}
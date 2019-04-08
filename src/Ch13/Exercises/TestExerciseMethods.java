package Ch13.Exercises;

import java.util.*;

public class TestExerciseMethods {
    public static Scanner gib = new Scanner(System.in);

    public static void main(String... args) {
        testSumDigits();
        //testBasicallyMod();
        //testFibonacciSequence();
    }

    private static void testSumDigits() {
        System.out.print("Input Integer to Sum: ");
        int noot = gib.nextInt();
        System.out.println("\n" + ExerciseMethods.sumDigits(noot));
        System.out.println("\n" + ExerciseMethods.basicallyMod(noot));
    }

    private static void testBasicallyMod() {
        System.out.print("Input Integer to Check Divisevness by 3: ");
        int noot = gib.nextInt();
        System.out.println("\n" + ExerciseMethods.basicallyMod(noot));
    }

    private static void testFibonacciSequence() {
        System.out.print("Input Integer to Fibonacci: ");
        int noot = gib.nextInt();
        ExerciseMethods.fibonnaciSequence(noot);
    }
}
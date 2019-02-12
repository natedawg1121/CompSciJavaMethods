package Ch11.Exercises;

import java.util.ArrayList;

public class ExerciseMethods {
    public static void main(String[] args) {
        ArrayList<String> testS = new ArrayList<>();
        testS.add("If it hadn't been for Cotton-Eye Joe");
        testS.add("I'd been married a long time ago");
        testS.add("Where did you come from, where did you go?");
        testS.add("Where did you come from, Cotton-Eye Joe?");

        ArrayList<Integer> testI = new ArrayList<>();
        testI.add(420);
        testI.add(69);
        testI.add(720);
        testI.add(7);

        System.out.println(reverseList(testS));
        removeSmallest(testI);
        System.out.println(testI);
    }
    public static ArrayList<String> reverseList(ArrayList<String> yeet) {
        ArrayList<String> noot = new ArrayList<>(yeet.size());
        for (int i = yeet.size() - 1; i >= 0; i--) {
            noot.add(yeet.get(i));
        }
        return noot;
    }

    public static void removeSmallest(ArrayList<Integer> yeet) {
        int smallestIndex = 0;
        int smallBoi = yeet.get(0);
        for (int i = 1; i < yeet.size(); i++) {
            if (yeet.get(i).compareTo(smallBoi) < 0) {
                smallBoi = yeet.get(i);
                smallestIndex = i;
            }
        }
        yeet.remove(smallestIndex);
    }
}
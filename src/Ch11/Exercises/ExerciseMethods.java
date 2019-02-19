package Ch11.Exercises;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ExerciseMethods {
    ArrayList<String> testS = new ArrayList<>();
    ArrayList<Integer> testI = new ArrayList<>();
    ArrayList<String> testW = new ArrayList<>();

    ExerciseMethods() {
        testS.add("If it hadn't been for Cotton-Eye Joe");
        testS.add("I'd been married a long time ago");
        testS.add("Where did you come from, where did you go?");
        testS.add("Where did you come from, Cotton-Eye Joe?");

        testI.add(420);
        testI.add(69);
        testI.add(720);
        testI.add(7);

        testW.add("If");
        testW.add("it");
        testW.add("hadn't");
        testW.add("been");
        testW.add("for");
        testW.add("Cotton-Eyed");
        testW.add("Joe");
        testW.add("I'd");
        testW.add("been");
        testW.add("married");
        testW.add("a");
        testW.add("long");
        testW.add("time");
        testW.add("ago");
    }

    ArrayList<String> reverseList(ArrayList<String> yeet) {
        ArrayList<String> noot = new ArrayList<>(yeet.size());
        for (int i = yeet.size() - 1; i >= 0; i--) {
            noot.add(yeet.get(i));
        }
        return noot;
    }

    void removeSmallest(ArrayList<Integer> yeet) {
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

    void bigIntFibonacci() {
        ArrayList<BigInteger> phil = new ArrayList<>();

        phil.add(BigInteger.valueOf(0));
        phil.add(BigInteger.valueOf(1));
        for (int i = 2; i < 100; i++) {
            phil.add(phil.get(i - 1).add(phil.get(i - 2)));
        }
        System.out.println(phil.toString());
    }

    void wordBuckets(ArrayList<String> words) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<String>[] buckets = new ArrayList[26];
        Arrays.setAll(buckets, ArrayList :: new);
        for (String word : words)
            for (int i = 0; i < alphabet.length; i++)
                if (word.toLowerCase().charAt(0) == alphabet[i])
                    buckets[i].add(word);
        for (List high : buckets) {
            System.out.println(high.toString());
        }
    }
}
package Ch11.Exercises;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ExerciseMethods {
    ArrayList<String> testS = new ArrayList<>();
    ArrayList<Integer> testI = new ArrayList<>();
    List<String> testW = new ArrayList<>();

    ExerciseMethods() {
        testS.add("If it hadn't been for Cotton-Eye Joe");
        testS.add("I'd been married a long time ago");
        testS.add("Where did you come from, where did you go?");
        testS.add("Where did you come from, Cotton-Eye Joe?");

        testI.add(420);
        testI.add(69);
        testI.add(720);
        testI.add(7);

        expandTestW();
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

    void wordBuckets(List<String> words) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        @SuppressWarnings("unchecked")
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

    private void expandTestW() {
        String cottonEyedJoe = (
        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "He came to town like a midwinter storm " +
        "He rode through the fields, so handsome and strong " +
        "His eyes was his tools and his smile was his gun " +
        "But all he had come for was having some fun " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "He brought disaster wherever he went " +
        "The hearts of the girls was to Hell, broken, sent " +
        "They all ran away so nobody would know " +
        "And left only men 'cause of Cotton-Eye Joe " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe? " +

        "If it hadn't been for Cotton-Eye Joe " +
        "I'd been married a long time ago " +
        "Where did you come from, where did you go? " +
        "Where did you come from, Cotton-Eye Joe?"
        );

        cottonEyedJoe = cottonEyedJoe.replaceAll("[?,]", "");
        String[] arr = cottonEyedJoe.split(" ");
        testW = Arrays.asList(arr);
    }
}
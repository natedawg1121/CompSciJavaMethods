package Ch11.Exercises;

public class TestExerciseMethods {
    private static ExerciseMethods t = new ExerciseMethods();

    public static void main(String[] args) {
        //testReverseList();
        //testRemoveSmallest();
        //testBigIntFibonacci();
        testWordBuckets();
    }

    private static void testReverseList() {
        System.out.println(t.reverseList(t.testS));
    }

    private static void testRemoveSmallest() {
        t.removeSmallest(t.testI);
        System.out.println(t.testI);
    }

    private static void testBigIntFibonacci() {
        t.bigIntFibonacci();
    }

    private static void testWordBuckets() {
        t.wordBuckets(t.testW);
    }
}
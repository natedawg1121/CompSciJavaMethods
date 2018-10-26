package Ch07;

public class RecursiveAddition {
    public static void main(String[] args) {
        System.out.println(addIt(10000, 0));
    }

    private static double addIt(int r, int t) {
        ++t;
        if(t == r) {
            return 0;
        } else {
            return ((1 / Math.pow(t, 2)) + addIt(r, t));
        }
    }
}
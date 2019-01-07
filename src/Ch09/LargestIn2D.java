package Ch09;

public class LargestIn2D {
    public static void main(String[] args) {
        int[][] noot = new int[10][10];
        System.out.println(positiveMax(noot));
    }

    private static int positiveMax(int[][] m) {
        int max = m[0][0];
        for (int[] top : m)
            for (int bottom : top)
                if (bottom > max)
                    max = bottom;
        if (max < 0)
            return max;
        else
            return 0;
    }
}
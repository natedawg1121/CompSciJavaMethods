package Ch09;

import java.util.Arrays;

public class RotatingMethods {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6,7,8,9,0};
        rotate(b, 4);
        System.out.println(Arrays.toString(b));
    }

    public static void rotateLeft(int[] a) {
        int i, temp;
        temp = a[0];
        for (i = 0; i < a.length - 1; i++)
            a[i] = a[i + 1];
        a[i] = temp;
    }

    public static void rotateRight(int[] a) {
        int i, temp;
        temp = a[a.length - 1];
        for (i = a.length - 1; i > 0; i--)
            a[i] = a[i - 1];
        a[i] = temp;
    }

    public static void rotate(int[] a, int d) {
        if (d < 0) {
            for (int i = 0; i < d; i++)
                rotateLeft(a);
        } else if (d > 0) {
            for (int i = 0; i < d; i++)
                rotateRight(a);
        }
    }
}

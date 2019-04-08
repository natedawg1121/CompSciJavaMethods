package Ch13.Exercises;

class ExerciseMethods {
    static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    static boolean basicallyMod(int n) {
        String y = Integer.toString(n);
        y = y.substring(y.length() - 1);
        int z = Integer.parseInt(y);
        if (n < 3) return false;
        else return sumDigits(z) == 3 || sumDigits(z) == 6 || sumDigits(z) == 9;
    }

    static void fibonnaciSequence(int n) {
        int ptr1 = 1, ptr2 = 1;
        int temp;
        System.out.print(ptr1 + " " + ptr2 + " ");
        for (int i = 2; i < n; i++) {
            System.out.print(ptr1 + ptr2 + " ");
            temp = ptr1;
            ptr1 = ptr2;
            ptr2 = temp + ptr2;
        }
    }
}
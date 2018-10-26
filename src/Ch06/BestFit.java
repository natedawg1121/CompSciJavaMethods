package Ch06;

import java.util.Scanner;

public class BestFit {

    private static Scanner gib = new Scanner(System.in);

    public static void main(String[] args) {
        double i1 = gib.nextDouble();
        double i2 = gib.nextDouble();
        double i3 = gib.nextDouble();
        System.out.println(findBestFit(i1, i2, i3));
    }
    public static int findBestFit(double size1, double size2, double space) {
        double totalSize = (size1 + size2);
        if (totalSize <= space) {
            return 3;
        } else if ((size1 <= space) && (size2 <= space)) {
            if (size1 > size2) {
                return 1;
            } else if (size1 < size2) {
                return 2;
            } else {
                return 0;
            }
        } else if (size1 <= space) {
            return 1;
        } else if (size2 <= space) {
            return 2;
        } else {
            return 0;
        }
    }
}
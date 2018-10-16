package Ch06;

public class ComparisonMethods {


    public static void main(String[] args) {

        System.out.println(max(1, 3));

        System.out.println(max(2,8,3));

        System.out.println(perfectSquare(16));
        System.out.println(perfectSquare(7));

        System.out.println(totalWages(45, 12.50));
    }

    private static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    private static int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    private static boolean perfectSquare(int n) {
        double hold;
        return !(Math.sqrt((double) n) % 1 != 0);
    }

    private static double totalWages(double hours, double rates) {
        double wages;
        if (hours <= 40) {
            wages = hours * rates;
        } else {
            wages = (40 * rates + ((hours - 40) * (rates * 1.5)));
        }
        return wages;
    }
}
package Ch06;

public class BePrepared {
    public static void main(String[] args) {
        System.out.println(getOrderTotal(8, 56));
    }

    private static double getOrderTotal(int bp, int np) {
        int totalB = (bp + np);

        if (totalB >= 12) {
            return (16.00 * totalB);
        } else if (totalB >= 3) {
            return (16.95 * totalB);
        } else if ((bp == 1) && (np == 0)) {
            return 20.95;
        } else if ((bp == 0) && (np == 1)) {
            return 12.95;
        } else {
            return 39.95;
        }
    }
}
package Ch06;

public class BestFit {
    public static void main(String[] args) {
        System.out.println(findBestFit(1,3,3));
    }
    public static int findBestFit(int size1, int size2, int space) {
        int totalSize = (size1 + size2);
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
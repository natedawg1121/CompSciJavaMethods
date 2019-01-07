package Ch09;

public class MagicSquare {

    public static int[][] makeMagicSquare(int n) {
        int[][] magic = new int[n][n];

        int row = 0;
        int col = n / 2;
        magic[row][col] = 1;

        for (int i = 2; i <= n * n; i++) {
            if (magic[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            } else {
                col = (col - 1 + n) % n;
            }
            magic[row][col] = i;
        }
        return magic;
    }

    public static void main(String[] args) {
        int doot = 3;
        int[][] arr = makeMagicSquare(doot);
        // print results
        for (int i = 0; i < doot; i++) {
            for (int j = 0; j < doot; j++) {
                if (arr[i][j] < 10)  System.out.print(" ");  // for alignment
                if (arr[i][j] < 100) System.out.print(" ");  // for alignment
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
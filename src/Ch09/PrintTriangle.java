package Ch09;

public class PrintTriangle {
    public static void main(String[] args) {
        int l = 10;
        int[][] arr = pascalsTriangle(l);
        int cnt = 0;
        for (int[] top : arr) {
            for (int t = l; t > cnt; t--) {
                System.out.print("  ");
            }
            for (int b = 0; b < cnt + 1; b++) {
                for (int s = 5; s > Integer.toString(top[b]).length(); s--) {
                    System.out.print(" ");
                }
                System.out.print(top[b]);
                for (int s = 5; s < Integer.toString(top[b]).length(); s++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            cnt++;
        }
    }

    private static int[][] pascalsTriangle(int n) {
        int[][] triangle = new int[n + 1][n + 1];
        triangle[0][0] = 1;
        for (int i = 1; i < n + 1; i++)
            for (int j = 0; j < i + 1; j++)
                if (j == 0 || j == i)
                    triangle[i][j] = 1;
                else
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];

        return triangle;
    }
}
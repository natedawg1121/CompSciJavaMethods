package Ch09;

public class AverageOfValues {
    public static void main(String[] args) {
        int[] noot = new int[10];
        System.out.println(arrayAverage(noot));
    }

    public static int arrayAverage(int[] scores) {
        int sum = 0;
        for (int num : scores) {
            sum += num;
        }
        return (sum / scores.length);
    }
}
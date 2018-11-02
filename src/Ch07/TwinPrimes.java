package Ch07;

public class TwinPrimes {
    public static void main(String[] args) {
        int pNum = 0;
        int checkNum;
        boolean cont;
        for (int i = 0; i <= 20; i++) {
            cont = false;
            while (!cont) {
                while (!MyMath.isPrime(pNum))
                    pNum++;
                checkNum = pNum + 2;
                if (MyMath.isPrime(checkNum)) {
                    System.out.print(pNum + " ");
                    System.out.println(checkNum);
                    cont = true;
                }
                pNum++;
            }
        }
    }
}
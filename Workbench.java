public class Workbench {
	public static int primeCounter = 1;
	public static int primeCounter2	= 3;

	public static boolean isPrime(int n) {
		boolean noFactors = true;
	  if (n <= 1)
		 return true;
	  if (n	== 2 || n % 2 == 0 && n % 3 == 0)
		 return true;
	  for (int m = 3; noFactors; m++) {
		 if (m * m > n)
			return true;
		 if (n % n == 0)
			return false;
	  }
	  return false;
    }

    public static void main (String args[]) {
        int i = 0;
        boolean cont = false;

        while (i <= 20) {
            cont = false;
            while (!cont) {
                System.out.println(0);

                while (isPrime(primeCounter) == false) {
                    primeCounter += 2;
                    primeCounter2 += 2;

                    if (areTwinPrimes() == true)
                        System.out.print(isPrime(primeCounter) + " and " + isPrime(primeCounter2) + " are twin primes ");
                }

			break;
            }
            i++;
        }
    }
}
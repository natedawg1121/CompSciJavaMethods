package Ch09.Sieve;

// Sieve of Eratosthenes

public class Sieve {
    public static void main(String[] args) {
        int n = 1000000;
        boolean[] isPrime = markPrimes(n);
        int count = 0;

        for (int p = 0; p < n; p++)
            if (isPrime[p]) {
                System.out.print(p + " ");
                count++;
            }

        System.out.println();
        System.out.println(count + " primes under " + n);
    }

    private static boolean[] markPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i < n; i++)
            isPrime[i] = true;

        for (int p = 2; p < n; p++)
            if (isPrime[p])
                for (int i = 2 * p; i < n; i += p)
                    isPrime[i] = false;

        return isPrime;
    }
}
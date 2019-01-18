package Ch10.Fraction;

public class Fraction {

    // ******************  Instance variables  ******************

    private int num;
    private int denom;
    public static final int DFLT_DENOM = 10000;

    // *********************  Constructors  *********************

    Fraction() {
        num = 0;
        denom = 1;
    }

    Fraction(int n) {
        num = n;
        denom = 1;
    }

    Fraction(int n, int d) {
        if (d != 0) {
            num = n;
            denom = d;
            reduce();
        } else {
            throw new IllegalArgumentException("Fraction construction error: denominator is 0");
        }
    }

    Fraction(Fraction other) {
        num = other.num;
        denom = other.denom;
    }

    // ********************  Public methods  ********************

    // Returns the sum of this fraction and other
    public Fraction add(Fraction other) {
        int newNum = num * other.denom + denom * other.num;
        int newDenom = denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    // Returns the sum of this fraction and m
    public Fraction add(int m) {
        return new Fraction(num + m * denom, denom);
    }

    Fraction subtract(Fraction other) {
        int newNum = num * other.denom - denom * other.num;
        int newDenom = denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    Fraction divide(Fraction other) {
        if(other.num == 0)
            throw new IllegalArgumentException("Cannot divide by 0");
        int newNum = num * other.denom;
        int newDenom = denom * other.num;
        return new Fraction(newNum, newDenom);
    }

    // Returns the product of this fraction and other
    Fraction multiply(Fraction other) {
        int newNum = num * other.num;
        int newDenom = denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    // Returns the product of this fraction and m
    public Fraction multiply(int m) {
        return new Fraction(num * m, denom);
    }

    // Returns the value of this fraction as a double
    double getValue() {
        return (double)num / (double)denom;
    }

    static Fraction valueOf(double x) {
        int num = (int)(x * DFLT_DENOM);
        return new Fraction(num, DFLT_DENOM);
    }

    // Returns a string representation of this fraction
    public String toString() {
        return num + "/" + denom;
    }

    // *******************  Private methods  ********************

    // Reduces this fraction by the gcf and makes denom > 0
    private void reduce() {
        if (num == 0) {
            denom = 1;
            return;
        }

        if (denom < 0) {
            num = -num;
            denom = -denom;
        }

        int q = gcf(Math.abs(num), denom);
        num /= q;
        denom /= q;
    }

    // Returns the greatest common factor of two positive integers
    private int gcf(int n, int d) {
        if (n <= 0 || d <= 0) {
            throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
        }

        while (d != 0) {
            int temp = d;
            d = n % d;
            n = temp;
        }
        return n;
    }
}
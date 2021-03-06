package Ch10.Exercises;

public class Coins {
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins (int cents) {
        while (cents > 24) {
            cents -= 25;
            quarters++;
        }
        while (cents > 9) {
            cents -= 10;
            dimes++;
        }
        while (cents > 4) {
            cents -= 5;
            nickels++;
        }
        while (cents > 0) {
            cents -= 1;
            pennies++;
        }
    }

    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }
}
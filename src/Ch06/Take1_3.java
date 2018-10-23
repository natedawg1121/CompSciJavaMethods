package Ch06;

// Chapter 6 Question 21

import java.util.Scanner;

public class Take1_3 {
    private static Scanner kboard;

    private int stonesLeft;

    public Take1_3(int n) {
        stonesLeft = n;
    }

    /*
     * Returns the correct number of stones to take
     * (according to the winning strategy) when nStones
     * remain in the pile; if such a move is not possible,
     * returns a random number of stones to take.
     * Precondition: nStones > 0
     */
    public int computerMove(int nStones) {
        switch (nStones) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            default:
                return 1 + (int) (2 * Math.random());
        }
    }

    /*
     * Prompts the user to take a number of stones;
     * If the move is valid, returns the number of stones
     * taken; otherwise, displays an error message --
     * "You are allowed to only take 1, 2, or 3 stones" or
     * "Can't take that many: only <nStones> left in the pile"
     * -- and returns -1:
     * Precondition: nStones > 0
     */
    public int humanMove(int nStones) {
        System.out.print("How many stones will you take? (1-3): ");
        int n = kboard.nextInt();
        if (n < 1 || n > 3) {
            System.out.println("You are only allowed to take 1, 2, or 3 stones!");
            return -1;
        } else {
            return n;
        }
    }

    /**
     * Plays the game
     */
    public void play() {
        while (stonesLeft > 0) {
            System.out.println(stonesLeft + " stone(s) left in the pile");

            int n = -1;
            while (n < 0)
                n = humanMove(stonesLeft);
            stonesLeft -= n;
            System.out.println("You took " + n + " stone(s)");
            if (stonesLeft == 0) {
                System.out.println("Congrats -- you won!");
            } else {
                n = computerMove(stonesLeft);
                stonesLeft -= n;
                System.out.println("The computer took " + n + " stone(s)");
                if (stonesLeft == 0)
                    System.out.println("Hooray -- the computer won!");
            }
        }
    }

    /****************************************************************/

    public static void main(String[] args) {
        kboard = new Scanner(System.in);

        int n = 8 + (int) (4 * Math.random());
        Take1_3 game = new Take1_3(n);
        game.play();

        kboard.close();
    }
}

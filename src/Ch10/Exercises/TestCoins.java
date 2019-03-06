package Ch10.Exercises;

import java.util.Scanner;

public class TestCoins {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input amount in cents: ");
        Coins sense = new Coins(gib.nextInt());
        System.out.println("That comes to:");
        System.out.println(sense.getQuarters() + " quarters,");
        System.out.println(sense.getDimes() + " dimes,");
        System.out.println(sense.getNickels() + " nickels,");
        System.out.println("and " + sense.getPennies() + " pennies.");
    }
}
package Ch06;

import java.util.Scanner;

public class FiveLines {
    private static Scanner gib = new Scanner(System.in);

    private static int line;
    private static boolean stay;

    public static void main(String[] args) {
        stay = true;
        while (stay) {
            inputty();
        }
    }

    private static void inputty() {
        System.out.print("Enter your number 1-10 (or anything else to quit): ");
        line = gib.nextInt();
        switch(line) {
            case 1:
                System.out.println("Buckle my shoe");
                break;
            case 2:
                System.out.println("Buckle my shoe");
                break;
            case 3:
                System.out.println("Shut the door");
                break;
            case 4:
                System.out.println("Shut the door");
                break;
            case 5:
                System.out.println("Pick up sticks");
                break;
            case 6:
                System.out.println("Pick up sticks");
                break;
            case 7:
                System.out.println("Lay them straight");
                break;
            case 8:
                System.out.println("Lay them straight");
                break;
            case 9:
                System.out.println("Begin again");
                break;
            case 10:
                System.out.println("Begin again");
                break;
            default:
                System.out.println("Bye");
                stay = false;
                break;
        }
    }
}

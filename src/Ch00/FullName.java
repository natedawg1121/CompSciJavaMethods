package Ch00;//Author = Nathan Stewart
import java.util.*;
public class FullName {
     public static void main(String args[]) {
          Scanner nameInput = new Scanner(System.in);
          System.out.print("What is your first name?: ");
          String firstName = nameInput.next();
          System.out.print("What is your last name?: ");
          nameInput.close();
     }
}
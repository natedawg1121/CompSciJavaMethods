package Ch00;//Author = Nathan Stewart
import java.util.*;
public class RadiusOfCircle {
     public static void main(String[] args) {
          Scanner areaInput = new Scanner(System.in);
          System.out.print("What is the area?:");
          double area = areaInput.nextDouble();
          System.out.println("Radius of your circle is " + Math.sqrt(area / Math.PI) + ".");
     }
}
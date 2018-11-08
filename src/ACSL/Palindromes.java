// NAME: NATHAN STEWART
// SCHOOL: LOVELAND HIGH SCHOOL
// DIVISION: UNKNOWN

///////////////////////////////////////////////
//                TEST WITH                  //
// 6A,    16                             121 //
// 5896,  13                        BB8AA8BB //
// 8769,  15                        45522554 //
// 46894, 10                NONE, 1317544822 //
// AAB4,  12                          3A88A3 //
///////////////////////////////////////////////

package ACSL;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Palindromes {
    // This sets the number of inputs
    /////////////////////////////////////
    private static int toq = 5;
    /////////////////////////////////////
    private static ArrayList<String> gib;

    public static void main(String args[]) {
        toq *= 2;
        collectData();
        for (int i = 0; i < toq; i += 2) {
            tacoCat(i);
        }
    }

    private static void collectData() {
        gib = new ArrayList<>();
        int setNum = 0;

        for (int i = 0; i < toq; i++) {
            if (i % 2 == 0) {
                setNum += 1;
                gib.add(JOptionPane.showInputDialog("Enter number for set " + setNum + " : "));
            } else {
                gib.add(JOptionPane.showInputDialog("Enter the base for set " + setNum + " : "));
            }
        }
    }

    private static void tacoCat(int ree) {
        int mitosis = ree;
        int apoptosis = ree + 1;

        String first = gib.get(mitosis).toUpperCase();
        int vex = Integer.parseInt(gib.get(apoptosis));
        int phineas = Integer.parseInt(first, vex);

        while (!istPalindrom(first) && (phineas < 1000000000)) {
            phineas = Integer.parseInt(first, vex);
            int ferb = Integer.parseInt(reverseReverse(first), vex);
            first = Integer.toString(phineas + ferb, vex);
            phineas = Integer.parseInt(first, vex);
        }

        String output;

        if (istPalindrom(first)) {
            output = first.toUpperCase();
        } else {
            output = "NONE, " + first.toUpperCase();
        }
        System.out.println(output);
    }

    private static boolean istPalindrom(String noot) {
        return noot.equals(reverseReverse(noot));
    }

    private static String reverseReverse(String yote) {
        String reverse = "";

        for (int i = yote.length() - 1; i >= 0; i--) {
            reverse += yote.charAt(i);
        }

        return reverse;
    }
}
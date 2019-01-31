// NAME: NATHAN STEWART
// SCHOOL: LOVELAND HIGH SCHOOL
// DIVISION: UNKNOWN

package ACSL;

import javax.swing.*;

public class StringDiff {
    private static int toq = 5;
    private static String[] gibAs = new String[toq];
    private static String[][] gibAl = new String[toq][2];
    private static String[] gibBs = new String[toq];
    private static String[][] gibBl = new String[toq][2];

    public static void main(String[] args) {
        collectData();
        wumboJumble();
    }

    private static void collectData() {
        int lop = toq * 2;
        int setNum = 0;
        for (int i = 0; i < lop; i++) {
            if (i % 2 == 0) {
                setNum++;
                String input = JOptionPane.showInputDialog("Enter input A for set " + setNum + " : ");
                gibAs[setNum - 1] = input;
                gibAl[setNum - 1] = input.split(" ");
            } else {
                String input = JOptionPane.showInputDialog("Enter input B for set " + setNum + " : ");
                gibBs[setNum - 1] = input;
                gibBl[setNum - 1] = input.split(" ");
            }
        }
    }

    private static void wumboJumble() {
        for (int i = 0; i < toq; i++) {
            String outA = "";
            String outB = "";
            String fullOut = "";
            for (String noot : gibAl[i]) {
                if (gibBs[i].contains(noot))
                    outA += noot + " ";
            }
            System.out.println(outA);

            for (String noot : gibBl[i]) {
                if (gibAs[i].contains(noot))
                    outB += noot + " ";
            }
            System.out.println(outB);

            outA = outA.replace(" ", "");
            outB = outB.replace(" ", "");

            for (int j = 0; j < outA.length(); j++) {
                if (outB.contains(Character.toString(outA.charAt(j)))) {
                    fullOut += Character.toString(outA.charAt(j));
                    outB = outB.substring(outB.indexOf(outA.charAt(j)) + 1);
                }
            }
            System.out.println(fullOut);
            System.out.println();
        }
    }
}
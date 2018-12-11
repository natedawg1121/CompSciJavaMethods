// NAME: NATHAN STEWART
// SCHOOL: LOVELAND HIGH SCHOOL
// DIVISION: UNKNOWN

///////////////////////////////////////////////
//                TEST WITH                  //
// 13256709, 3                           789 //
// 3587612098, 1                          49 //
// 265472, 5                           46547 //
// 3126854901231, 4                    12798 //
// 25768437216701562, 7             15413544 //
///////////////////////////////////////////////

package ACSL;

import javax.swing.JOptionPane;

public class DigitalReassembly {
    private static int toq = 5;
    private static String[] gib = new String[toq * 2];

    public static void main(String[] args) {
        collectData();
        for (int i = 0; i < toq * 2; i += 2) {
            splitAndSlap(gib[i], gib[i + 1]);
        }
    }

    private static void collectData() {
        int setNum = 0;
        for (int i = 0; i < toq * 2; i++) {
            if (i % 2 == 0) {
                setNum += 1;
                gib[i] = JOptionPane.showInputDialog("Enter number " + setNum + " : ");
            } else {
                gib[i] = JOptionPane.showInputDialog("Enter size " + setNum + " : ");
            }
        }
    }

    private static void splitAndSlap(String n, String s) {
        int size = Integer.parseInt(s);
        int len = n.length();
        while (len % size != 0) {
            n += "0";
            len = n.length();
        }
        int result = 0;
        for (int i = 0; i < len; i += size) {
            result += Integer.parseInt(n.substring(i, i + size));
        }

        System.out.println(result);
    }
}
// NAME: NATHAN STEWART
// SCHOOL: LOVELAND HIGH SCHOOL
// DIVISION: UNKNOWN

///////////////////////////////////////////////
//                TEST WITH                  //
// a1b1c1$                               CGM //
// a2c4s5l3$                            FTLN //
// c5p4L3u2l1$                         OSUUG //
// c2h3p4$                               AKO //
// m1o2n3t4r5e1a2l3$                AACGGQVX //
///////////////////////////////////////////////

package ACSL.FirstOne;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class EncodedLetters {
    private ArrayList<String> gib;
    private String rückgrat;


    public static void main(String[]args) {
        EncodedLetters run = new EncodedLetters();
        run.encodeAndWrap();
    }


    private EncodedLetters() {
        gib = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            gib.add(JOptionPane.showInputDialog("Enter list of letters and numbers, end list with $: "));
        }
        rückgrat = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }


    private void encodeAndWrap() {
        for (int u = 0; u < 5; u++) {
            int num, regel, halt;
            String hab, charakter;
            String gefiltert;

            num = 1;
            hab = "";

            gefiltert = gib.get(u);
            gefiltert = String.join("", (String.join("", gefiltert.split(" "))).split(","));
            gefiltert = gefiltert.toUpperCase();

            for (int j = 0; j < gefiltert.indexOf("$") - 1; j += 2) {
                charakter = gefiltert.substring(j, j + 1);
                regel = Integer.parseInt(gefiltert.substring(j + 1, j + 2));
                halt = rückgrat.indexOf(charakter) + 1;

                if (regel == 1) {
                    num += halt * 2;
                } else if (regel == 2) {
                    num += (halt % 3) * 5;
                } else if (regel == 3) {
                    num += halt / 4 * (-8);
                } else if (regel == 4) {
                    num += (((int) Math.sqrt(halt)) * (-12)) % 26;
                } else if (regel == 5) {
                    num += (sumOfFactors(halt) * 10);
                }

                if (num > 26) {
                    num = num % 26;
                }
                if (num < 0) {
                    num = rückgrat.length() + num;
                }
                hab += rückgrat.substring(num - 1, num);
            }
            System.out.println(hab);
        }
    }

    private int sumOfFactors(int n) {
        int sum = 1;
        for(int k = 2; k * k <= n; k++) {
            int p = 1;

            while(n % k == 0) {
                p = p * k + 1;
                n /= k;
            }
            sum *= p;
        }
        if(n > 1)
            sum *= 1 + n;
        return sum;
    }
}
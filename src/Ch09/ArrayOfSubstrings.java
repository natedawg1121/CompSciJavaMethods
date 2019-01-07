package Ch09;

import java.util.*;

public class ArrayOfSubstrings {
    public static void main(String args[]) {
        String[] b = {"phil's", "white", "shirt"};
        System.out.println(Arrays.deepToString(allOfDemArrayStyle(b)));
    }

    private static String[] allOfDem(String s) {
        int n = ((s.length() * (s.length() + 1)) / 2);
        String[] allStrings = new String[n];
        int place = 0;
        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j <= s.length(); j++) {
                allStrings[place] = (s.substring(i, j));
                place++;
            }

        return allStrings;
    }
    
    private static String[][] allOfDemArrayStyle(String[] s) {
        String place = s[0];
        int max = place.length();
        for (String w : s)
            if (max < w.length())
                max = w.length();

        String[][] yeet = new String[s.length][(max * (max + 1)) / 2];
        for (int i = 0; i < s.length; i++){
            String[] result = allOfDem(s[i]);
            for (int j = 0; j < result.length; j++)
                yeet[i][j] = result[j];
        }

        return yeet;
    }
}
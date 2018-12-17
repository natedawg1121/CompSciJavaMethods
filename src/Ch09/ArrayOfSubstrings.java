package Ch09;

public class ArrayOfSubstrings {
    public static void main(String args[]){
        String[] neep = {"phil's", "white", "shirt"};
        String place = neep[0];
        int max = place.length();
        for (int w = 0; w < neep.length; w++)
            if (max < neep[w].length())
                max = neep[w].length();

        String[][] yeet = new String[neep.length][(max * (max + 1)) / 2];
        for (int i = 0; i < neep.length; i++){
            String[] result = allOfDem(neep[i]);
            for (int j=0; j<result.length;j++)
                yeet[i][j] = result[j];
        }

        System.out.println();

        for (int j = 0; j < yeet.length; j++) {
            for (int i = 0; i < yeet[j].length; i++)
                if (yeet[j][i] != null)
                    System.out.print(yeet[j][i] + " ");
        }
        System.out.println();
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
}
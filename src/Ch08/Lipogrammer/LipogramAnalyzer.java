package Ch08.Lipogrammer;

public class LipogramAnalyzer {
    private String raw;

    public LipogramAnalyzer(String s) {
        raw = s;
    }

    public String mark(char letter) {
        String marked = raw.replaceAll(Character.toString(letter), "#");
        return marked;
    }

    public String allWordsWith(char letter) {
        String[] textArray = raw.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        String fin = "";
        for (String num : textArray)
            if (num.contains(Character.toString(letter)) && !fin.contains(" " + num + " "))
                fin += (" " + num + " \n");

        return fin;
    }
}
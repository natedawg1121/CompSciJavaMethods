package Ch08.Lipogrammer;

public class LipogramAnalyzer {
    private String raw, marked;

    public LipogramAnalyzer(String s) {
        raw = s;
    }

    public String mark(char letter) {
        marked = raw.replaceAll(Character.toString(letter), "#");
        return marked;
    }

    public String allWordsWith(char letter) {
        String[] textArray = raw.split(" ");
        String fin = "";
        for (String num : textArray)
            if(num.contains(Character.toString(letter)) && !fin.contains(num))
                fin += (num + "\n");
        return fin;
    }
}
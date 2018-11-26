package Ch08;

import java.util.Scanner;

public class DOSorNaw {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("INPUT FILENAME: ");
        String n = gib.next();
        n = n.toUpperCase();
        System.out.println(validFileName(n));
    }

    private static String validFileName(String fileName) {
        if (fileName.contains(":"))
            return fileName + " IS NOT A VALID FILENAME (':' IS AN INVALID CHARACTER)";
        if (fileName.contains("?"))
            return fileName + " IS NOT A VALID FILENAME ('?' IS AN INVALID CHARACTER)";
        if (fileName.contains("*"))
            return fileName + " IS NOT A VALID FILENAME ('*' IS AN INVALID CHARACTER)";
        if (fileName.contains("."))
            if (fileName.indexOf('.') > 8)
                return fileName + " IS NOT A VALID FILENAME (FILENAME IS TOO LONG)";
            else
                if (fileName.length() - 1 > fileName.indexOf('.') + 3)
                    return fileName + " IS NOT A VALID FILENAME (FILENAME EXTENSION IS TOO LONG)";
                else
                    return fileName + " IS A VALID FILENAME";
        if (fileName.length() > 8)
            return fileName + " IS NOT A VALID FILENAME (FILENAME IS TOO LONG)";

        fileName += ".TXT";
        return fileName + " IS A VALID FILENAME";
    }
}
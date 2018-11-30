package Ch08.HangmanPackage;

public class HangmanGame {
    public String answer;
    public StringBuffer answerGuess, triedLetters;

    public HangmanGame (String s){
        answer = s;
        answerGuess = new StringBuffer(answer.length());
        for (int i = 0; i < answer.length(); i++)
            answerGuess.insert(i, "-");
        triedLetters = new StringBuffer();
    }

    public String getGuessed() {
        return answerGuess.toString();
    }

    public String getTried() {
        return triedLetters.toString();
    }

    int tryLetter(char letter) {
        if (triedLetters.toString().contains(Character.toString(letter))) {
            return 0;
        } else if (answer.contains(Character.toString(letter))) {
            triedLetters.append(letter); triedLetters.append(" ");
            for (int i = 0; i < answer.length(); i++) {
                if(answer.charAt(i) == letter)
                    answerGuess.setCharAt(i, letter);
            }
            return 1;
        } else {
            triedLetters.append(letter); triedLetters.append(" ");
            return -1;
        }
    }
}
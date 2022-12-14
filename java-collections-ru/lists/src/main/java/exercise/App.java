package exercise;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

// BEGIN
public class App {

    public static boolean scrabble(String letters, String word) {
        var lettersLowerCase = letters.toLowerCase();
        var wordLowerCase = word.toLowerCase();

        List<String> lettersList = new LinkedList<>();
        List<String> wordList = new ArrayList<>();

        lettersList = stringToList(lettersList, lettersLowerCase);
        wordList = stringToList(wordList, wordLowerCase);

        for (var letter: wordList) {

            if (!lettersList.contains(letter)) {
                return false;
            }
            lettersList.remove(letter);
        }
        return true;
    }

    public static List<String> stringToList(List<String> retList, String str) {
        for (int counter = 0; counter < str.length(); counter++) {
            retList.add(String.valueOf(str.charAt(counter)));
        }
        return retList;
    }


}
//END

package exercise;

import com.sun.source.util.SourcePositions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {

        String[] symbolsArray = symbols.toLowerCase().split("");
        String[] wordArray = word.toLowerCase().split("");

        List<String> symbolsList = new ArrayList<>(Arrays.asList(symbolsArray));
        List<String> wordList = new ArrayList<>(Arrays.asList(wordArray));

        for (String current : wordList) {
            if (!symbolsList.contains(current)) {
                return false;
            }
            symbolsList.remove(current);
        }
        return true;
    }
}
//END

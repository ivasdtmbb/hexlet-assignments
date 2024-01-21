package exercise;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static Boolean scrabble(String symbols, String word) {
        String[] symbolsArray = symbols.toLowerCase().split("");
        String[] wordArray = word.toLowerCase().split("");

        var symbolsList = new ArrayList<>(Arrays.asList(symbolsArray));
        var wordList = new ArrayList<>(Arrays.asList(wordArray));

        for (String symbol : wordList) {
            if (!symbolsList.contains(symbol)) {
                return false;
            }
            symbolsList.remove(symbol);
        }
        return true;
    }
}
//END

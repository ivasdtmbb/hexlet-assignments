package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class App {

/*    public static void main(String[] args) {
        Map wordsCount = getWordCount("java is the best programming language java");
        System.out.println(wordsCount);
        String result = toString(wordsCount);
        System.out.println(result);

        Map wordsCount2 = App.getWordCount("");
        String result2 = App.toString(wordsCount2);
        System.out.println(result2); // => {}

    }
*/

    public static Map getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordsMap = new HashMap<>();

        if (sentence.equals("")) {
            return wordsMap;
        }
        int initialCounter = 1;

        for (var word: words) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, initialCounter);
            } else {
                var newValue = wordsMap.get(word) + 1;
                wordsMap.put(word, newValue);
            }
        }
        return wordsMap;
    }

    public static String toString(Map wordsMap) {
        String stringResult = new String();

        if (wordsMap.isEmpty()) {
            stringResult = "{}";
            return stringResult;
        }

        List<String> wordsToList = new ArrayList<>();

        wordsToList.add("{\n");
        for (Object word: wordsMap.keySet()) {
            wordsToList.add("  " + word + ": " + wordsMap.get(word).toString() + "\n");
        }
        wordsToList.add("}");

        for (var element: wordsToList) {
            stringResult += element;
        }
        return stringResult;
    }
}
//END

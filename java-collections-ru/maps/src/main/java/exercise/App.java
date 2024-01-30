package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsMap = new HashMap<>();

        if (sentence.isEmpty()) {
            return wordsMap;
        }

        for (var word : sentence.split(" ")) {
            wordsMap.putIfAbsent(word, 0);
            wordsMap.put(word, wordsMap.get(word) + 1);
        }

        return wordsMap;
    }

    public static String toString(Map<String, Integer> wordsMap) {
        if (wordsMap.isEmpty()) {
            return "{}";
        }

        var result = new StringBuilder();

        result.append("{\n");
        for (var entry : wordsMap.entrySet()) {
            result.append("\s\s" + entry.getKey() + ": " + entry.getValue() + "\n");
        }
        result.append("}");

        return result.toString();
    }
}
//END

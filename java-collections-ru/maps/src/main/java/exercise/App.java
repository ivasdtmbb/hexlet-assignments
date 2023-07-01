package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsAndCounter = new HashMap<>();
        String[] words = sentence.split(" ");

        if (sentence.length() == 0) {
            return wordsAndCounter;
        }

        final int initialCounter = 1;

        for (String word : words) {
            if (wordsAndCounter.containsKey(word)) {
                wordsAndCounter.put(word, wordsAndCounter.get(word) + 1);
            }
            wordsAndCounter.putIfAbsent(word, initialCounter);
        }
        return wordsAndCounter;
    }

    public static String toString(Map wordsAndCounter) {
        if (wordsAndCounter.isEmpty()) {
            return "{}";
        }
        var result = new StringBuilder();

        result.append("{\n");
        for (Object key : wordsAndCounter.keySet()) {
            result.append("  " + key + ": " + wordsAndCounter.get(key) + "\n");
        }
        result.append("}");
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "word text cat apple word map apple word";
        Map wordsCount = App.getWordCount(sentence);
        String result = App.toString(wordsCount);
        System.out.println(wordsCount);
        System.out.println(result);

        String sentence2 = "word text cat apple word apple word";
        Map wordsCount2 = App.getWordCount(sentence2);
        String result2 = App.toString(wordsCount2);
        System.out.println(wordsCount2);
        System.out.println(result2);

        String sentence3 = "";
        Map wordCount3 = App.getWordCount(sentence3);
        String actual3 = App.toString(wordCount3);
        System.out.println(actual3);
    }

}
//END

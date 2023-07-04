package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

public class App {

    public static <T> List findWhere(List<Map<T, T>> books, Map<T, T> findABook) {
        List<Map<T, T>> foundBooks = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            boolean hasParameters = true;
            Map<T, T> book = books.get(i);
            for (Map.Entry<T, T> parameter : findABook.entrySet()) {
                T parameterKey = parameter.getKey();
                T parameterValue = parameter.getValue();
                if (!(book.containsKey(parameterKey) && book.get(parameterKey).equals(parameterValue))) {
                    hasParameters = false;
                    break;
                }
            }
            if (hasParameters) {
                foundBooks.add(book);
            }
        }
        System.out.println("Looking for a match: " + findABook);
        System.out.println("Books were found: " + foundBooks);
        return foundBooks;
    }
}

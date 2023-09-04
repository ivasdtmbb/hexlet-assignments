package exercise;

//import java.sql.Array;
import java.util.List;
import java.util.ArrayList;
//import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List<String> sortedApartments = new ArrayList<>();
        if (apartments.isEmpty()) {
            return sortedApartments;
        }
        sortedApartments = apartments.stream()
                .sorted((apt1, apt2) -> apt1.compareTo(apt2))
                .map(apt -> apt.toString())
                .toList();

        return sortedApartments.subList(0, n);
    }
}
// END

package exercise;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.Arrays;

//import static java.util.Collections.replaceAll;

// BEGIN
public class App {
    public static String getForwardedVariables(String configData) {
        String environmentVariable = "environment=";
        String prefix = "X_FORWARDED_";

        String result = Arrays.stream(configData.split("\n"))
                .filter(data -> data.startsWith(environmentVariable))
                .map(data -> data.replace("\"", ","))
                .flatMap(data -> Arrays.stream(data.split(",")))
                .filter(data -> data.startsWith(prefix))
                .map(data -> data.replace(prefix, ""))
                .peek(data -> System.out.println(data))
                .collect(Collectors.joining(","));

        return result;
    }

//    public static void main(String[] args) {
//        Path filePath = Path.of("...s2.conf");
//        String content = null;
//        try {
//            content = Files.readString(filePath);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        String data = getForwardedVariables(content);
//
//        System.out.println(data);
//        System.out.println("2***");
//
//    }
}
//END

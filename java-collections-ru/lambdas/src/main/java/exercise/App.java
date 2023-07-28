package exercise;

import java.util.Arrays;


// BEGIN
class App {
    public static String[] duplicateValues(String[] elements) {
        return Arrays.stream(elements)
                .flatMap(element -> Arrays.stream(new String[]{element, element}))
                .toArray(String[]::new);
    }

    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] horizontallyDuplicated = Arrays.stream(image)
                .map(line -> duplicateValues(line))
                .toArray(String[][]::new);

        return Arrays.stream(horizontallyDuplicated)
                .flatMap(line -> Arrays.stream(new String[][]{line, line}))
                .toArray(String[][]::new);
    }
}



//    public static void main(String[] args) {
//        String[][] image = {
//                {"*", "*", "*", "*"},
//                {"*", " ", " ", "*"},
//                {"*", " ", " ", "*"},
//                {"*", "*", "*", "*"},
//        };
//        System.out.println(deepToString(image));
//        String[] dublicatedString = App.duplicateValues(image[1]);
//        System.out.println(deepToString(dublicatedString));
//
//        String[][] enlargedImage = App.enlargeArrayImage(image);
//        System.out.println(deepToString(enlargedImage));
//    }

// END

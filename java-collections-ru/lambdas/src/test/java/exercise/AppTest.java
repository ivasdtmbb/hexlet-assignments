package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test

    void testEnlargeArrayImage() {

        //Test 01
        String[][] image01 = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] actual01 = App.enlargeArrayImage(image01);
        String[][] correctlyEnlarged01 = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(actual01).isEqualTo(correctlyEnlarged01);

        //Test 02
        String[][] image02 = {
                {"@", "-", "-", "-", "@"},
                {"@", "@", "@", "@", "@"},
                {"{", "#", "-", "#", "}"},
                {"{", "{", "$", "}", "}"},
        };
        String[][] actual02 = App.enlargeArrayImage(image02);
        String[][] correctlyEnlarged02 = {
                {"@", "@", "-", "-", "-", "-", "-", "-", "@", "@"},
                {"@", "@", "-", "-", "-", "-", "-", "-", "@", "@"},
                {"@", "@", "@", "@", "@", "@", "@", "@", "@", "@"},
                {"@", "@", "@", "@", "@", "@", "@", "@", "@", "@"},
                {"{", "{", "#", "#", "-", "-", "#", "#", "}", "}"},
                {"{", "{", "#", "#", "-", "-", "#", "#", "}", "}"},
                {"{", "{", "{", "{", "$", "$", "}", "}", "}", "}"},
                {"{", "{", "{", "{", "$", "$", "}", "}", "}", "}"},
        };
        assertThat(actual02).isEqualTo(correctlyEnlarged02);

        //Test 03
        String[][] image03 = {
                {"$", "$", "$"},
                {"$", "$", "$"},
                {"$", "$", "$"},
        };
        String[][] actual03 = App.enlargeArrayImage(image03);
        String[][] correctlyEnlarged03 = {
                {"$", "$", "$", "$", "$", "$"},
                {"$", "$", "$", "$", "$", "$"},
                {"$", "$", "$", "$", "$", "$"},
                {"$", "$", "$", "$", "$", "$"},
                {"$", "$", "$", "$", "$", "$"},
                {"$", "$", "$", "$", "$", "$"},
        };
        assertThat(actual03).isEqualTo(correctlyEnlarged03);
    }
}
// END

package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ReversedSequenceTest {

    @Test
    void testReversedSequence() {
        CharSequence testText = new ReversedSequence("abcdef");

        String expectedToString = "fedcba";
        assertThat(testText.toString()).isEqualTo(expectedToString);

        char expectedCharAt = 'd';
        assertThat(testText.charAt(2)).isEqualTo(expectedCharAt);

        int expectedLength = 6;
        assertThat(testText.length()).isEqualTo(expectedLength);

        String expectedSubSequence = "edc";
        assertThat(testText.subSequence(1, 4).toString()).isEqualTo(expectedSubSequence);
    }
}

package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers0 = new ArrayList<>();
        int count0 = 5;
        List<Integer> result0 = new ArrayList<>();
        assertThat(App.take(numbers0, count0)).isEqualTo(result0);

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        int count1 = 5;
        List<Integer> result1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        assertThat(App.take(numbers1, count1)).isEqualTo(result1);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        int count2 = 10;
        List<Integer> result2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        assertThat(App.take(numbers2, count2)).isEqualTo(result2);

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(21, 22, 23, 24, 25));
        int count3 = 0;
        List<Integer> result3 = new ArrayList<>();
        assertThat(App.take(numbers3, count3)).isEqualTo(result3);

        // END
    }
}

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class sortTest {

    @Test
    @DisplayName("버블 정렬 테스트")
    void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();

        List<Integer> bubble = bubbleSort.bubble(6, new ArrayList<>(List.of(1, 3, 4, 6, 2, 10)));

        Assertions.assertThat(bubble).isEqualTo(List.of(1, 2, 3, 4, 6, 10));
    }
}
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class sortTest {

    @Test
    @DisplayName("버블 정렬 테스트")
    void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] bubble = bubbleSort.bubble(6, new int[]{1, 3, 4, 6, 2, 10});

        assertThat(bubble).isEqualTo(new int[]{1, 2, 3, 4, 6, 10});
    }

    @Test
    @DisplayName("선택 정렬 테스트")
    void selectionSort(){
        SelectionSort selectionSort = new SelectionSort();

        int[] selection = selectionSort.selection(6, new int[]{5, 1, 4, 10, 6, 20});

        assertThat(selection).isEqualTo(new int[]{1,4,5,6,10,20});
    }

    @Test
    @DisplayName("삽입 정렬 테스트")
    void insertionSort(){
        InsertionSort insertionSort = new InsertionSort();

        int[] insertion = insertionSort.insertion(6, new int[]{10, 5, 6, 3, 8, 2});

        assertThat(insertion).isEqualTo(new int[]{2,3,5,6,8,10});
    }

    @Test
    @DisplayName("기수 정렬 테스트")
    void radixSort(){
        RadixSort radixSort = new RadixSort();

        int[] radix1 = radixSort.radix(6, new int[]{5, 8, 4, 6, 2, 1}, 1);
        int[] radix2 = radixSort.radix(6,new int[]{43,33,28,61,15,97},2);

        assertThat(radix1).isEqualTo(new int[]{1,2,4,5,6,8});
        assertThat(radix2).isEqualTo(new int[]{15,28,33,43,61,97});
    }

    @Test
    @DisplayName("병합 정렬 테스트")
    void mergeSort(){
        MergeSort mergeSort = new MergeSort();

        int[] merge = mergeSort.mergeSort(new int[]{1, 6, 3, 8, 4, 2}, 0, 5);

        assertThat(merge).isEqualTo(new int[]{1,2,3,4,6,8});
    }

    @Test
    @DisplayName("퀵 정렬 테스트")
    void quickSort(){
        QuickSort quickSort = new QuickSort();

        int[] quick = quickSort.quickSort(new int[]{6, 4, 1, 3, 8, 7}, 0, 5);

        assertThat(quick).isEqualTo(new int[]{1,3,4,6,7,8});
    }
}
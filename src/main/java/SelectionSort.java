public class SelectionSort {

    public int[] selection(int n, int[] list) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (list[min] > list[j]) {
                    min = j;
                }
            }
            int tmp = list[i];
            list[i] = list[min];
            list[min] = tmp;
        }
        return list;
    }
}

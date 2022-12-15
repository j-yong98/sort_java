public class MergeSort {

    private int[] merge(int[] arr, int l, int r, int m) {
        int i = l;
        int j = m + 1;

        int idx = l;
        int[] new_arr = new int[r+1];
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                new_arr[idx++] = arr[i];
                i++;
            } else {
                new_arr[idx++] = arr[j];
                j++;
            }
        }

        while (i <= m) {
            new_arr[idx++] = arr[i];
            i++;
        }

        while (j <= r) {
            new_arr[idx++] = arr[j];
            j++;
        }

        for (int k = l; k <= r; k++) {
            arr[k] = new_arr[k];
        }

        return arr;
    }

    public int[] mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, r, mid);
            return arr;
        }
        return null;
    }
}

public class QuickSort {

    private int partition(int[] arr,int l,int r){
        int pivot = arr[r];
        int i = l - 1;

        for (int j = l; j < r; j++){
            if (arr[j] < pivot){
                i++;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = tmp;

        return i+1;
    }
    public int[] quickSort(int[] arr, int l, int r){
        if (l < r){
            int pos = partition(arr,l,r);

            quickSort(arr, l, pos - 1);
            quickSort(arr, pos + 1, r);
            return arr;
        }
        return null;
    }
}

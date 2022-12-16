public class HeapSort {

    private void heapify(int[] arr, int n, int i){
        int max = i;
        int l = i * 2;
        int r = i * 2 + 1;

        if (l <= n && arr[max] < arr[l]){
            max = l;
        }
        if (r <= n && arr[max] < arr[r]){
            max = r;
        }

        if (max != i){
            int tmp = arr[max];
            arr[max] = arr[i];
            arr[i] = tmp;
            heapify(arr,n,max);
        }

    }

    public int[] heapSort(int[] arr,int n){
        for (int i = n / 2; i >= 1; i--){
            heapify(arr,n,i);
        }

        for (int i = n; i > 1; i--){
            int tmp = arr[1];
            arr[1] = arr[i];
            arr[i] = tmp;
            heapify(arr,i-1,1);
        }

        return arr;
    }
}

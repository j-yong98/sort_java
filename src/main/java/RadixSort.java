import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    public int getDigit(int n, int k){
        int ans = n;
        for (int i = 0; i < k; i++){
            ans = n % 10;
            n /= 10;
        }
        return ans;
    }

    public int[] radix(int n, int[] arr,int k){
        for (int x = 1; x <= k; x++){
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++){
                list.add(new ArrayList<>());
            }
            for (int i = 0; i < n; i++){
                int num = getDigit(arr[i],x);
                list.get(num).add(arr[i]);
            }

            int[] new_arr = new int[n];
            int idx = 0;
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < list.get(i).size(); j++){
                    new_arr[idx++] = list.get(i).get(j);
                }
            }
            arr = new_arr;
        }
        return arr;
    }
}

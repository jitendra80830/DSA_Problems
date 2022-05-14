package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MaxSubArraySumZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        //Brut force
        int max_len = Integer.MIN_VALUE;
        for (int i = 0; i <n-1 ; i++) {
            int sum = 0;
            sum = arr[i];
            for (int j = i+1; j <n ; j++) {
                sum+= arr[j];
                if(sum == 0){
                    if(max_len < j-i+1){
                        max_len = j-i+1;
                    }
                }
            }
        }
        System.out.println(max_len);
        System.out.println(maxSubArraySumZero(arr ,n));
    }

    private static int maxSubArraySumZero(int[] arr, int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
            if(arr[i] ==0 && max_len ==0){
                max_len = 1;
            }
            if(sum == 0){
                max_len = i+1;
            }
            if(map.get(sum)!=null){
                max_len = Math.max(max_len , i - map.get(sum));
            }else {
                map.put(sum , i);
            }
        }
        return max_len;
    }
}

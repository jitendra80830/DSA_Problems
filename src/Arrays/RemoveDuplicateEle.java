package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size());
        removeDuplicates(arr);
    }

    private static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i =0;
        for (int j = 1; j <nums.length ; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Find_Target_Indices_After_Sorting_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        targetIndices(arr , target);
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;

    }
}

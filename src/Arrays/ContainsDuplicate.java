package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        containsDuplicate(arr);
        containsDuplicate2(arr);
    }

    private static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            if(integers.contains(nums[j])){
                return true;
            }
            integers.add(nums[j]);
        }
        return false;
    }

    private static boolean containsDuplicate(int[] nums) {//O(n^2)
        boolean flag = false;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i] == nums[j] && i!=j){
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                break;
            }
        }
        if (flag == false) {

            return false;
        }else {
            return true;
        }
    }
}

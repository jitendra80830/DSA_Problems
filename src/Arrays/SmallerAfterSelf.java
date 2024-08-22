package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallerAfterSelf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> count = smallerNumberAfterSelf(arr);
        for (int i = 0; i <count.size() ; i++) {
            System.out.print(count.get(i)+" ");
        }
    }
    private static List<Integer> smallerNumberAfterSelf(int[] nums) { //Tc = O(n^2) giving TLE
        int n = nums.length;

        List<Integer> ans = new ArrayList<>();
        int index = 0;
        for (int i = 0; i <n ; i++) {
            int count = 0;
            for (int j = i+1; j <n ; j++) {
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            ans.add(count);
            index++;
        }
        return ans;
    }
}

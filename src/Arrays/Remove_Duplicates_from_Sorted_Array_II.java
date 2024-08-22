package Arrays;

import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int ele : nums){
            if(i ==0 || i==1|| nums[i-2]!=ele){
                nums[i] = ele;
                i++;
            }
        }
        return i;
    }
}

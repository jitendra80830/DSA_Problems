package Arrays;

import java.util.Scanner;

public class Search_Insert_Position {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(searchInsert(arr , target));

    }

    private static int searchInsert(int[] nums, int target) {
        int flag = 0;

        for (int i = 0; i <nums.length ; i++) {
            if (target >= nums[nums.length-1]){
                flag = nums.length;
                break;
            }
            else if(nums[i] == target){
                flag = i;
                break;
            }
            else if(nums[i] > target){
                flag = i;
                break;
            }

        }
        return flag;
    }
}

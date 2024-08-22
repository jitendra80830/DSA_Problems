package Arrays;

import java.util.Scanner;

public class FindFirstIndex_LastIndex_OfEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
//        int ans[] = searchRange(arr,target); // TC = 0(n)
//        for (int i = 0; i <ans.length ; i++) {
//            System.out.print(ans[i]+" ");
//        }
        int ans[] =searchRange1(arr , target);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] searchRange1(int[] nums, int target) {
        int firstIndex = -1;
        int lastIndex = -1;
        int ans[] = new int[2];
        int low  = 0;
        int high = nums.length -  1;
        while (low <=high){
            int mid = (high + low)/2;
            if(nums[mid] == target){
                firstIndex = mid;
                high = mid -1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <=high){
            int mid = (high + low)/2;
            if(nums[mid] == target){
                lastIndex = mid;
                low = mid+1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;

    }






    private static int[] searchRange(int[] nums , int target) {
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == target){
                firstIndex = i;
                break;
            }
        }
        for (int i = nums.length -1; i>=0 ; i--) {
            if(nums[i] == target){
                lastIndex = i;
                break;
            }
        }
        int ans[] = new int[2];
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;

    }
}

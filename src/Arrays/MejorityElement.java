package Arrays;

import java.util.Scanner;

public class MejorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(count == 0){
                ele = nums[i];
            }
            if(ele == nums[i]){
                count++;
            }else {
                count--;
            }

        }
        count = 0;
        int majorEle = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(ele == nums[i]){
                count++;
            }
        }
        if(count > nums.length/2){
            majorEle = ele;
        }
        return majorEle;

    }
}

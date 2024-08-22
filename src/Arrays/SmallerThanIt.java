package Arrays;

import java.util.Scanner;

public class SmallerThanIt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = smallerNumbersThanCurrent(arr);
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;

        int ans[] = new int[n];

        int index = 0;
        for (int i = 0; i <n ; i++) {
            int count = 0;
            for (int j = 0; j <n ; j++) {
                if(i!=j && nums[j] < nums[i]){
                    count++;
                }
            }
            ans[index] = count;
            index++;
        }
        return ans;
    }

}

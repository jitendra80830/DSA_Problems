package Arrays;

import java.util.Scanner;

public class OddLengthSubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(sumOddLengthSubarrays(nums));
    }

    private static int sumOddLengthSubarrays(int[] nums) {
        int n  = nums.length;
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int start = n - i;
            int end = i + 1;
            int total = start * end;
            int odd = total /2;
            if(total % 2 ==1){
                odd++;
            }
            sum+=odd * nums[i];;
        }
        return sum;
    }

}

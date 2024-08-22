package Arrays;

import java.util.Scanner;

public class EvenLengthSubArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(sumEvenLengthSubarrays(nums));
    }
    private static int sumEvenLengthSubarrays(int[] nums) {
        int n  = nums.length;
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int start = n - i;
            int end = i + 1;
            int total = start * end;
            int odd = total /2;
//            if(total % 2 ==1){ //for odd len sun array sum
//                odd++;
//            }
            sum+=odd * nums[i];;
        }
        return sum;
    }
}

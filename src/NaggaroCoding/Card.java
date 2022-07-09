package NaggaroCoding;

import java.util.Scanner;

public class Card {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1  = sc.nextInt();
        int input2[] = new int[input1];
        for (int i = 0; i <input1 ; i++) {
            input2[i] = sc.nextInt();
        }
        System.out.println(card(input1 , input2));
    }

    private static int card(int input1, int[] input2) {
        int min_sum = Integer.MAX_VALUE;
        int curr_sum = 0;
        for (int i = 0; i <input1 ; i++) {
            curr_sum = curr_sum + input2[i];
            if(curr_sum < min_sum){
                min_sum = curr_sum;
            }
            if(curr_sum > 0){
                curr_sum = 0;
            }
        }
        int sum = 0;
        for (int i = 0; i <input1 ; i++) {
            sum+=input2[i];
        }
        int ans = sum + (min_sum * (-2));
        return ans;
    }
}

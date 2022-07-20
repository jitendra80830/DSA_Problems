package Arrays;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];

        for (int i = 0; i <n ; i++) {
            prices[i] = sc.nextInt();
        }
        //System.out.println(maxProfit(prices)); //TC = 0(N^2)
       //System.out.println( maxProfit2(prices)); wrong value giving
        System.out.println(maxProfit3(prices));//TC = 0(n) and TS = 0(n)

    }

    private static int maxProfit3(int[] prices) {

        int maxCurr = Integer.MIN_VALUE;//-infinite
        int max[] = new int[prices.length];
        for (int i = prices.length-1; i>=0 ; i--) {
            int curr = prices[i];//4

            if(curr > maxCurr){
                maxCurr = curr;
            }
            max[i] = maxCurr;
        }
//        for (int i = 0; i < prices.length ; i++) {
//            System.out.println(max[i] + " "+ prices[i]);
//        }

        int maxVal = Integer.MIN_VALUE;//-infinite
        for (int i = 0; i <prices.length ; i++) {
            int currMax = max[i] - prices[i];
            if(currMax > maxVal){
                maxVal = currMax;
            }

        }
        return maxVal;
    }

    private static int maxProfit2(int[] prices) {

        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            int curr = prices[i];
            if(minValue > curr){
                minValue = curr;
                minIndex = i;
            }
        }

        int maxIndex = 0;
        int minindex1 = minIndex;
        int maxValue = Integer.MIN_VALUE;
        for (int i = minindex1; i <prices.length ; i++) {
            int curr = prices[i];
            if(maxValue < curr){
                maxValue = curr;
                maxIndex = i;
            }
        }
        return (prices[maxIndex] - prices[minIndex]);







    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i =0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                int currMax = prices[j] - prices[i];
                if(maxProfit < currMax){
                    maxProfit = currMax;
                }
            }
        }
        if(maxProfit <= 0){
            return 0;
        }else{
            return maxProfit;
        }
    }
}

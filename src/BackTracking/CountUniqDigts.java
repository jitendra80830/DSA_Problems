package BackTracking;

import java.util.Scanner;

public class CountUniqDigts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(uniqDigits(n));


    }

    private static long uniqDigits(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 10;
        }
        if(n == 2){
            return 91;
        }
        long dp[] = new long[n+1];
        long res = 91;
        dp[0] = 1;
        dp[1] = 10;
        dp[2] = 81;
        for (int i = 3; i <=n ; i++) {
            dp[i] = dp[i -1] * (10 -i +1);
            res+=dp[i];

        }
        return res;

    }
}

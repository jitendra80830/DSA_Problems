package Arrays;

import java.util.Scanner;

public class CountPrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));
    }

    private static int countPrimes(int n) {
        if(n ==0 || n == 1){
            return 0;
        }
        int count = 0;
        for (int i = 2; i <n ; i++) {
            if(isPrime(i)){
                count++;
            }

        }
        return count;
    }

    private static boolean isPrime(int i) {
        int m = i/2;
        int flag = 0;
        for (int j = 2; j <=m; j++) {
            if(i%j == 0){
                flag = 1;
            }
            if(flag == 1){
                break;
            }

        }
        if(flag == 0){
            return true;
        }else {
            return false;
        }

    }
}

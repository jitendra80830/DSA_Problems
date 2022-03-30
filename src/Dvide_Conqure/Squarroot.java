package Dvide_Conqure;

import java.util.Scanner;

public class Squarroot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //System.out.println(squarRoot(n));
        System.out.print(squarRT2(n));
    }

    private static long squarRoot(long n) {
        if(n==0 || n==1){
            return n;
        }
        long start = 1;
        long end = n/2;
        long ans = 1;
        while (start <=end){
            long mid = start+(end-start)/2;
            long sqr = mid*mid;
            if(sqr == n){
                return mid;
            }
            else if(sqr <n){
                ans = mid;
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
    private static long squarRT2(long n){
        if (n == 0 || n == 1){
            return n;
        }
        long i = 1;
        while (i*i <=n){
            i = i+1;
        }
        return i-1;
    }
}

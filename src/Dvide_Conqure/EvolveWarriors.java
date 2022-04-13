package Dvide_Conqure;

import java.util.Scanner;

public class EvolveWarriors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long x = sc.nextLong();
        long y  = sc.nextLong();
        System.out.println(warrior(n ,m ,x ,y));
    }

    private static long warrior(long n, long m, long x, long y) {
        long i =0;
        long j =n ;
        long counter = 0;
        while (i <= j){
            long mid =i+(j-i)/2;
            if(x*mid <= m){
                i = mid + 1;
                counter = mid;
            }else {
                if(((n-mid)*y)+m>=(mid*x)){
                    i = mid + 1;
                    counter = mid;
                }else {
                    j = mid -1;
                }
            }
        }
        return counter;
    }
}

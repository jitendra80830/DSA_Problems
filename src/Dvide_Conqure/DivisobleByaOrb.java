package Dvide_Conqure;

import java.util.Scanner;
import java.util.Stack;

public class DivisobleByaOrb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long k = sc.nextInt();
        //find_kth_no_divisibleby_aorb(a ,b ,k);
        find_kth_no_divisibleby_aorb2(a ,b ,k); //optimize
    }

    private static void find_kth_no_divisibleby_aorb2(long a, long b, long k) {
        long low = 0;
        long high = Long.MAX_VALUE;
        long lcm = (a *b)/gcd(a , b);
        long ans = 0;
        while (low < high){
            long mid = (low + high)/2;
            ans = (mid/a) + (mid/b) - (mid/lcm);
            if(ans < k){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        System.out.println(low);


    }

    private static void find_kth_no_divisibleby_aorb(int a, int b, int k) {
        //Stack<Integer> st = new Stack<>();
        int count = 0;
        int i = 0;
        while (true){
            if(i%a ==0 || i%b == 0){
                count++;
                //st.push(i);
            }
            i++;
            if(count == k){
                System.out.println(i);
                break;
            }
        }
        //System.out.println(st.pop());
    }
    public static long gcd(long a , long b){
        if (b==0){
            return a;
        }
        return gcd(b , a %b);
    }

}

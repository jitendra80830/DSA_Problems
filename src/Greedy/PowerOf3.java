package Greedy;

import java.io.IOException;
import java.util.Scanner;

public class PowerOf3 {

    public static void greater(long n) {
        int[] p = new int[40];
        //long k = n;
        int index = 0;
        long x = n;
        while (x > 0) {
            p[index] = (int) (x % 3);
            x /= 3;
            index++;
        }
        int idx = 0;
        for (int i = 0; i < p.length - 1; ++i) {
            if (p[i] >= 2) {
                p[i] = 0;
                p[i + 1]++;
                for (int j = idx; j < i; ++j) {
                    p[j] = 0;
                }
                idx = i + 1;
            }
            if (p[i] == 3) {
                p[i] = 0;
                p[i + 1]++;
            }
        }
        int j = p.length - 1;
        if (p[j] >= 2) {
            p[index] = 1;
            index++;
        }
        long ans = 0;
        for (int i = p.length - 1; i >= 0; --i) {
            ans = ans * 3 + p[i];
        }
        System.out.print(ans);
    }

    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            greater(n);
            System.out.println();
        }
        //   if(flag==0)
        //   {
        //   // System.out.println(n);
        //   }
        //   else
        // //  System.out.println(convertBack(pos+1))
    }
}


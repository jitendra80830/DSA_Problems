package QueuePack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GoodQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = l; i <=r ; i++) {

            if(isLucky(i)){
                q.add(i);
            }
        }
        System.out.println(q.size());


    }

    static boolean isLucky(int n)
    {

        boolean arr[]=new boolean[10];
        for (int i = 0; i < 10; i++)
            arr[i] = false;

        while (n > 0)
        {
            // Find the last digit
            int digit = n % 10;


            if (digit >5 || arr[digit])
                return false;


            arr[digit] = true;


            n = n / 10;
        }
        return true;
    }

}

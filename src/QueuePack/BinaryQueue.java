package QueuePack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryQueue(n);
    }

    private static void binaryQueue(int n) {
        Queue<String> nums = new LinkedList<>();
        nums.add("1");
        for (int i = 1; i < n; i++) {
            String temp1 = nums.peek();
            nums.remove();
            System.out.print(temp1+" ");

            String temp2 = temp1;

            nums.add(temp1+ '0');
            nums.add(temp2+"1");

        }
    }
}

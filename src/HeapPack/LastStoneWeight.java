package HeapPack;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LastStoneWeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stone[] = new int[n];

        for (int i = 0; i <n ; i++) {
            stone[i] = sc.nextInt();
        }
        System.out.println(lastStoneWeight(stone));
    }

    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <stones.length ; i++) {
            max.add(stones[i]);
        }
        while (max.size()>1){
            int y = max.peek();
            max.remove();
            int x = max.peek();
            max.remove();
            if(x!=y){
                int newStone = (y-x);
                max.add(newStone);
            }
        }
        if(max.size() <1){
            return 0;
        }else {
            return max.peek();
        }

    }
}

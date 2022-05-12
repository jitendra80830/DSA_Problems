package QueuePack;

import java.util.*;
import java.util.Queue;

public class Find_Dividing_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr ,Collections.reverseOrder());
//        for (int i = 0; i <n ; i++) {
//            System.out.print(arr[i]);
//        }
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            q1.add(arr[i]);
        }
        Queue<Integer> q2 = new LinkedList<>();

        while (m-->0){
            int query = sc.nextInt();
            int count = 1;
//            int val = q1.peek() / 2;
//            q2.add(val);
//            q1.remove();
            while (!q1.isEmpty() || !q2.isEmpty()){
                if(q2.isEmpty()){
                    return;
                }
                if(q1.peek() > q2.peek()){
                    int dividedEel  = q1.peek();
                    int q2Val = dividedEel / 2;
                    q1.remove();
                    q2.add(q2Val);

                    if(count ==query){
                        System.out.println(dividedEel);
                        break;
                    }
                    count++;

                }else {
                    int dividedEle = q2.peek();
                    int q2Val = dividedEle / 2;
                    q2.remove();
                    q2.add(q2Val);
                    if(count == query){
                        System.out.println(dividedEle);
                        break;
                    }
                    count++;
                }
            }

        }
    }
}

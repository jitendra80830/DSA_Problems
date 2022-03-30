package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_According_To_Keys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item arr[] = new Item[n];
        for (int i = 0; i <n ; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            arr[i] = new Item(fv , sv);
        }
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.tv == o2.tv){
                    return o1.fv - o2.fv;
                }else {
                    return o1.tv - o2.tv;
                }
                //return o1.tv - o2.tv;
            }
        });
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i].fv+" + "+arr[i].sv+" = "+arr[i].tv);

        }
    }
}
class Item{
    int fv = 0;
    int sv = 0;
    int tv = 0;
    public Item(int f , int s){
        fv = f;
        sv = s;
        tv = fv + sv;
    }
}

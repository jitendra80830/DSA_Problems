package HeapPack;

import java.util.Scanner;

public class MinHeapClient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MinHeap mp = new MinHeap(n);
        for (int i = 1; i <=n ; i++) {
            int item = sc.nextInt();
            mp.insert(item);
        }
        System.out.println("before built mi heap");
        mp.print();
        System.out.println();
        System.out.println("After build min heap");
        mp.build_heap();
        System.out.println();
        mp.print();
        System.out.println();
//        mp.deletemin();
//        System.out.println();
//        mp.print();
//        mp.decreasekey(5,1);
//        mp.print();
        for (int i = 1; i <=n; i++) {
            System.out.print(mp.deletemin()+" ");

        }


    }
}

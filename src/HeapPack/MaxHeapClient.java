package HeapPack;

import java.util.Scanner;

public class MaxHeapClient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MinHeap maxHeap = new MinHeap(n);
        for (int i = 1; i <=n ; i++) {
            int item = sc.nextInt();
            maxHeap.insert(item);
        }
        System.out.println("before build heap");
        maxHeap.print();
        System.out.println();
        maxHeap.build_heap();
        System.out.println("after build heap");
        maxHeap.print();

//        System.out.println("Max key: "+maxHeap.deleteMax());
//        System.out.println("after deleted max key");
//        maxHeap.print();
        System.out.println();
        maxHeap.decreasekey(5,400);

        maxHeap.print();


    }
}

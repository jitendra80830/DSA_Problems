package HeapPack;

import java.util.*;
import java.io.*;
// find all possible subarrays and non-subarrays
// build maxheap nonSubArray
// build minheap subArray
// while swap>0
// swap top nonSubArray with min subArray
// get sum of subArray and store in another heap of maxOfSubArrays
class MaxHeap2 {
    private int[] Heap;
    private int size;       // no of elements
    private int maxsize;    // size of array
    MaxHeap2(int maxsize){
        this.maxsize = maxsize;
        size = 0;                           // increment when element added
        Heap = new int[this.maxsize+1];     // heap starts with 1 to n
        Heap[0] = Integer.MAX_VALUE;        // won't use 0 index but to avoid swapping
    }
    void insert(int element){
        Heap[++size] = element;
        int i=size;
        while(i>1 && Heap[i/2]<Heap[i]){
            swap(i, i/2);
            i=i/2;
        }
    }
    void build_Heap(){
        int j = (int)Math.floor(size/2.0);      // Math.floor returns double
        for(int i=j; i>=1; i--)
        {
            max_Heapify(Heap, i);
        }
    }
    int top(){
        return Heap[1];
    }
    int extract_Max(){
        if(size<1) System.out.println("Error");		// no element then can't remove
        int max = Heap[1];
        Heap[1] = Heap[size];
        size--;
        if(size>0) max_Heapify(Heap, 1);
        return max;
    }
    void increase_Key(int i, int key){
        if(key<Heap[i]) return;
        Heap[i] = key;
        while(i>1 && Heap[i/2]<Heap[i]){	// no need for maxheapify
            swap(i, i/2);
            i=i/2;
        }
    }
    void print_Heap(){
        for(int i=1; i<=size; i++){
            System.out.print(Heap[i]+" ");
        }
    }
    void heap_Sort(){
        build_Heap();
        int len = size;
        while(size>=2){
            swap(1,size);
            size--;
            max_Heapify(Heap, 1);
        }
        size = len;
    }
    private void max_Heapify(int[] Heap, int i){
        if(isLeaf(i)) return;
        int leftChild = 2*i;
        int rightChild = 2*i+1;
        if(rightChild <= size){				// if right child node exists and if right exists left exists too.....!
            if(Heap[i]>=Heap[leftChild] && Heap[i]>=Heap[rightChild]) return;
        }
        else{								// if left child node exists
            if(Heap[i]>=Heap[leftChild]) return;
        }
        int largest;
        largest = (leftChild<=size && Heap[i]<Heap[leftChild]) ? leftChild : i;					 // for case if left&right > i
        largest = (rightChild<=size && Heap[leftChild]<Heap[rightChild]) ? rightChild : largest; // for cases if any one > i
        if(largest != i){
            swap(largest, i);
        }
        max_Heapify(Heap, largest);     // if largest==i returns @ 34,37
    }
    private void swap(int a, int b){
        int temp = Heap[a];
        Heap[a] = Heap[b];
        Heap[b] = temp;
    }
    private boolean isLeaf(int i){
        if(i>size/2 && i<=size) return true;
        return false;
    }
}
class MinHeap2 {
    private int[] Heap;
    private int size;       // no of elements
    private int maxsize;    // size of array
    MinHeap2(int maxsize){
        this.maxsize = maxsize;
        size = 0;                           // increment when element added
        Heap = new int[this.maxsize+1];     // heap starts with 1 to n
        Heap[0] = Integer.MIN_VALUE;        // won't use 0 index but to avoid swapping
    }
    void insert(int element){
        Heap[++size] = element;
        int i=size;
        while(i>1 && Heap[i/2]>Heap[i]){
            swap(i, i/2);
            i=i/2;
        }
    }
    void build_Heap(){
        int j = (int)Math.floor(size/2.0);      // Math.floor returns double
        for(int i=j; i>=1; i--)
        {
            min_Heapify(Heap, i);
        }
    }
    int extract_Min(){
        //if(size<1) System.out.println("Error");
        int min = Heap[1];
        Heap[1] = Heap[size];
        size--;
        if(size>0) min_Heapify(Heap, 1);
        return min;
    }
    void decrease_Key(int i, int key){
        if(key>Heap[i]) return;
        Heap[i] = key;
        while(i>1 && Heap[i/2]>Heap[i]){
            swap(i, i/2);
            i=i/2;
        }
    }
    void heap_Sort(){
        build_Heap();
        int len = size;
        while(size>=2){
            swap(1,size);
            size--;
            min_Heapify(Heap, 1);
        }
        size = len;
    }
    void print_Heap(){
        for(int i=1; i<=size; i++){
            System.out.print(Heap[i]+" ");
        }
    }
    private void min_Heapify(int[] Heap, int i){
        if(isLeaf(i)) return;
        int leftChild = 2*i;
        int rightChild = 2*i+1;
        if(rightChild <= size){
            if(Heap[i]<=Heap[leftChild] && Heap[i]<=Heap[rightChild]) return;
        }
        else{
            if(Heap[i]<=Heap[leftChild]) return;
        }
        int smallest;
        smallest = (leftChild<=size && Heap[i]>Heap[leftChild]) ? leftChild : i;
        smallest = (rightChild<=size && Heap[leftChild]>Heap[rightChild]) ? rightChild : smallest;
        if(smallest != i){
            swap(smallest, i);
        }
        min_Heapify(Heap, smallest);     // if largest==i returns @ 34,37
    }
    private void swap(int a, int b){
        int temp = Heap[a];
        Heap[a] = Heap[b];
        Heap[b] = temp;
    }
    private boolean isLeaf(int i){
        if(i>size/2 && i<=size) return true;
        return false;
    }
}
public class SwapSum2 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nswap = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long res = maxSumOfSubArrays(arr,n,nswap);
        System.out.println(res);
    }
    private static long maxSumOfSubArrays(int[] arr, int n, int nswap){
        LinkedList<Long> subArraySum = new LinkedList<>();
        for(int i=1; i<=n; i++){
            for(int j=0; (j<n && j+i<=n); j++){
                LinkedList<Integer> subArray = new LinkedList<>();
                LinkedList<Integer> nonSubArray = new LinkedList<>();
                // 0 to j-1
                for(int l=0; l<=j-1; l++){
                    nonSubArray.add(arr[l]);
                }
                for(int k=j; k<j+i; k++){
                    subArray.add(arr[k]);
                }
                // j+1 to n-1
                for(int l=j+i; l<=n-1; l++){
                    nonSubArray.add(arr[l]);
                }

                long currSubArraySum = getSumOfSubArray(subArray, nonSubArray, nswap);
                subArraySum.add(currSubArraySum);

            }
        }
        long max = Integer.MIN_VALUE;
        for(Long i : subArraySum){
            if(max < i) max=i;
        }
        return max;
    }
    private static long getSumOfSubArray(LinkedList<Integer> subArray, LinkedList<Integer> nonSubArray, int nswap){
        MinHeap2 minheap = new MinHeap2(subArray.size());
        for(Integer i : subArray){
            minheap.insert(i);
        }
        if(nonSubArray.size() > 0){
            MaxHeap2 maxheap = new MaxHeap2(nonSubArray.size());
            for(Integer i : nonSubArray){
                maxheap.insert(i);
            }
            while(nswap-->0){
                int min = minheap.extract_Min();
                int max = maxheap.extract_Max();
                minheap.insert(max);
                maxheap.insert(min);
            }
        }
        long sum=0;
        for(int i=0; i<subArray.size(); i++){
            sum += minheap.extract_Min();
        }
        return sum;
    }
}

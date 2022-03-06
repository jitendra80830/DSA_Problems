package HeapPack;

public class MaxHeap {
    private int heap[];
    private int size;
    private int maxsize;
    public MaxHeap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        this.heap = new int[this.maxsize+1];
        this.heap[0] = Integer.MAX_VALUE;
    }
    public void insert(int element){
        this.heap[++size] = element;
    }
    public void build_heap() {
        int j = (int) Math.floor(this.size / 2.0); //first non leaves
        for (int i = j; i >= 1; i--) { // first non leave to 1 node
            max_heapify(heap, i);

        }
    }
    private void max_heapify(int[] heap, int i) {

        if(isleaves(i)){
            return;
        }
        int leftChild = 2*i;
        int rightChild = (2*i) + 1;
        if(rightChild <=size){ // if rightchild <= hai to ->
            if(heap[i] >=heap[leftChild] && heap[i] >=heap[rightChild]){ //->hai to if parent node ka value big hai left and right child value se the kuchh nhi karna hai return kr jao
                return;
            }
        }else { // yadi right child nhi hai to parent ka value big hai left child ke value se simple return kr jao
            if(heap[i] >=heap[leftChild]){
                return;
            }
        }
        int largest;
        // if left child less than or equal hai size and left ka value big hai parent se heap[i] then largest = leftchld
        if(leftChild <= size && heap[leftChild] > heap[i]){
            largest = leftChild;
        }else { // nhi to largest parent index hoga means i
            largest = i;
        }
        // if right child less than or equal hai size and right ka value big hai parent se heap[i] then largest = leftchld

        if(rightChild <= size && heap[rightChild] > heap[largest]){
            largest = rightChild;
        }

        if(largest!=i){ // if i largest not a parent then
            swap(largest ,i);
        }
        max_heapify(heap , largest);

    }

    private void swap(int largest, int i) {
        int temp = heap[i];
        heap[i] = heap[largest];
        heap[largest] = temp;
    }

    private boolean isleaves(int poss) { // possitions means index i
        if(poss > (size/2) && poss<=size){ //if poss first leave se bada and poss <= sixe se then that is leave node
            return true;
        }
        return false;
    }
    public void print(){
        for (int i = 1; i <=size ; i++) {
            System.out.print(heap[i]+" ");

        }
    }
    public int deleteMax(){
        if(this.size < 1){
            System.out.println("Heap is Empty");
        }
        int max = this.heap[1];
        heap[1] = heap[this.size];
        this.size = this.size -1;
        max_heapify(heap , 1);
        return max;
    }
    public void increaseKays(int i,int keys){
        if(keys < heap[i]){
            System.out.println("Error");
        }
        heap[i] = keys;
        while (i>1 && heap[i/2] < heap[i]){
            swap(i ,i/2 );
            i = i/2;
        }
    }

}

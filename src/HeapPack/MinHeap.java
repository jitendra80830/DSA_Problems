package HeapPack;

public class MinHeap {
    private int heap[];
    private int size;
    private int maxsize;
    public MinHeap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        this.heap = new int[this.maxsize+1];
        this.heap[0] = Integer.MIN_VALUE;
    }
    public void insert(int element){
        this.heap[++size] = element;
    }
    public void build_heap() {
        int j = (int) Math.floor(this.size / 2.0); //first non leaves
        for (int i = j; i >= 1; i--) { // first non leave to 1 node
            min_heapify(heap, i);

        }
    }
    private void min_heapify(int[] heap, int i) {

        if(isleaves(i)){
            return;
        }
        int leftChild = 2*i;
        int rightChild = (2*i) + 1;
        if(rightChild <=size){ // if rightchild <= hai to ->
            if(heap[i] <=heap[leftChild] && heap[i] <=heap[rightChild]){ //->hai to if parent node ka value small hai left and right child value se the kuchh nhi karna hai return kr jao
                return;
            }
        }else { // yadi right child nhi hai to parent ka value small hai left child ke value se simple return kr jao
            if(heap[i] <=heap[leftChild]){
                return;
            }
        }
        int smallest;
        // if left child less than or equal hai size and left ka value small hai parent se heap[i] then smallest = leftchld
        if(leftChild <= size && heap[leftChild] < heap[i]){
            smallest = leftChild;
        }else { // nhi to largest parent index hoga means i
            smallest = i;
        }
        // if right child less than or equal hai size and right ka value small hai parent se heap[i] then smallest = leftchld

        if(rightChild <= size && heap[rightChild] < heap[smallest]){
            smallest = rightChild;
        }

        if(smallest!=i){ // if i largest not a parent then
            swap(smallest ,i);
        }
        min_heapify(heap , smallest);

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
    public int deletemin(){
        if(this.size < 1){
            System.out.println("Heap is Empty");
        }
        int min = this.heap[1];
        heap[1] = heap[this.size];
        this.size--;
        min_heapify(heap , 1);
        return min;
    }
    public void decreasekey(int i,int keys){
        if(keys > heap[i]){
            System.out.println("Error");
        }
        heap[i] = keys;
        while (i>1 && heap[i/2] > heap[i]){
            swap(i ,i/2 );
            i = i/2;
        }
    }
    public int size(){
        return this.size;
    }
    public void removeElement(int k){
        decreasekey(k , Integer.MIN_VALUE);
        deletemin();
    }
    public void heapSort(int arr[]){
        build_heap();
        int length = size;
        for (int i = size; i>=2 ; i--) {
            swap(1 ,i);
            this.size--;
            min_heapify(heap ,1);

        }
        size = length;
    }

}

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc = new Scanner(System.in) ;
        int t =sc.nextInt() ;
        while(t-- > 0){
            int n =sc.nextInt();
            heap h = new heap(n) ;
            for(int i =0;i<n;i++)
                h.insert(sc.nextInt());
            System.out.print(h.changeMin()+" ");
            h.print();
        }
    }
}
class heap {
    static int size ;
    static int m_size ;
    static int heap[] ;
    heap(int n){
        size = 0 ;
        m_size = n ;
        heap = new int[n+1] ;
    }
    static int changeMin(){
        int min = heap[1] ;
        heap[1] = heap[size] ;
        size-- ;
        buildHeap();
        return min ;
    }
    static void buildHeap(){
        for(int i =size/2 ; i>=1 ; i--)
            m_heap(i) ;
    }
    static void m_heap(int i){
        int smallest = i ;
        if(i > size/2 )
            return ;
        if( 2*i+1 <= size ){
            if(heap[i] <= heap[2*i+1] && heap[i]<= heap[2*i])
                return ;
            if(heap[2*i]< heap[i])
                smallest = 2*i ;
            if(heap[2*i+1] < heap[smallest])
                smallest = 2*i+1 ;
        }
        else{
            if(heap[2*i] < heap[i])
                smallest= 2*i;
            else
                return ;
        }
        if(i!= smallest)
            swap(smallest,i);
        m_heap(smallest);
    }
    static void insert(int element ){
        heap[ ++size ] = element ;
        int i = size ;
        while( i>1 && heap[i/2] > heap[i] ){
            swap(i/2 , i );
            i = i/2 ;
        }
    }
    static void print(){
        for(int i=1 ; i<=size ;i++)
            System.out.print(heap[i]+" ") ;
        System.out.println("") ;
    }
    static void swap(int parent , int i){
        int temp = heap[parent]  ;
        heap[parent]=heap[i] ;
        heap[i] = temp ;
    }
}
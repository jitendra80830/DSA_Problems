package StackPack;

public class TwoStackOneArray {
    public int arr[];
    public int top1;
    public int top2;
    public int size;

    public TwoStackOneArray(int n){
        this.arr = new int[n];
        this.top1 = -1;
        this.size = n;
        this.top2 = size;


    }
    public void push1(int data){
        if(this.top1 < this.top2-1){
            arr[++top1] = data;
        }
        else {
            System.out.println("Stack1 is overflow");
        }
    }
    public void push2(int data){
        if(this.top1 < this.top2-1){
            arr[--top2] = data;
        }
        else {
            System.out.println("Stack2 is overflow");
        }
    }
    public void pop1(){

        if(this.top1>=0){
            int popElement = arr[top1--];
            System.out.println("pop element is : "+popElement);
        }else {
            System.out.println("Stack1 is underflow");
        }

    }
    public void pop2(){
        if(this.top2 < size){
            int popElement = arr[top2++];
            System.out.println("pop element is : "+popElement);
        }else {
            System.out.println("Stack is underflow");
        }
    }
    public void print1(){
        for (int i = top1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void print2(){
        for (int i = top2; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

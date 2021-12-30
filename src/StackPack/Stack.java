package StackPack;

public class Stack {
    protected int data[];
    private int top;
    public Stack(){
        this.data = new int[5];
        this.top = -1;
    }
    public Stack(int cap){
        this.data = new int[cap];
        this.top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == data.length-1;
    }
    public void push(int item) throws Exception {
        if(this.isFull()){
            throw new Exception("Stack is full");
        }
        this.top++;
        this.data[top] = item;
    }
    public int pop() throws Exception{
        if(this.isEmpty()) {
            throw new Exception("Stack if Empty");
        }
        int item = this.data[this.top];
        this.data[this.top] = 0;
        this.top--;
        return item;
    }
    public int size(){
        return this.top + 1;
    }
    public int peek() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Stack if Empty");
        }
        int item = this.data[this.top];
        return item;
    }
    public void display() throws Exception {
        if(this.isEmpty()) {
            throw new Exception("Stack if Empty");
        }
        for (int i = this.top; i >=0; i--) {
            System.out.print(this.data[i]+" ");
        }
        System.out.println();
    }
}

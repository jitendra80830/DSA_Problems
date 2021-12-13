package Recursion;

public class Print {
    public static void main(String[] args){
        print(4);
    }
    public static void print(int n){
        if(n < 0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}

package Basics;

public class SumDigit {
    public static void main(String[] args){
        int num = 95318;
        int digit = num % 100;
        int di1 = digit % 10;
        digit/=10;
        int di2 = digit %10;
        System.out.println(di1 +" "+ di2);
    }
}

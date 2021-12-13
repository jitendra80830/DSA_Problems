import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a ,b));
        int lcm = (a*b)/gcd(a,b);
        System.out.print(lcm);

    }
    public static int gcd(int a , int b){ // a = divident , b = diviser a%b
        if(a % b == 0){
            return b;
        }

        return gcd( b , a%b);
    }
}

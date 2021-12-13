import java.util.Scanner;

public class BankManger {
    public static void main(String args[]){

        //write your code here
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a No");
            //int n = sc.nextInt();
        int n =20;
            int ans = 0;
            while (n > 1) {
                int i = 2;
                if (n % i == 0) {
                    ans += i;
                    n = n / i;
                    //System.out.println(ans);
                }
                i++;
            }
            System.out.print(ans);

    }
}

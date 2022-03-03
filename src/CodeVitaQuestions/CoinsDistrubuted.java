package CodeVitaQuestions;

import java.util.Scanner;

public class CoinsDistrubuted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int values = sc.nextInt();
        int two = 0;

        //no of 5r coins
        int five = (values-4)/5;

        //no of 1r coins
        int one = 0;
        if((values - five*5)%2==0){
            one = 2;
        }else {
            one = 1;
        }
        // no of 2r coins
        two = (values - five*5 - one*1)/2;
        int totalCoins = (one+two+five);
        System.out.println(five+one+two+" "+five+" "+two+" "+one);


    }
}

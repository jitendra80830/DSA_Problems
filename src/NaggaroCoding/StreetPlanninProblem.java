package NaggaroCoding;

import java.util.Scanner;

public class StreetPlanninProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        System.out.println(streetPlanning(m));
    }

    private static int streetPlanning(int input1) {
        if(input1 == 1){
            return 4;
        }
        int count = 1;
        int count1 = 1;
        int count2;
        int count3;
        for (int i = 2; i <=input1 ; i++) {
            count2 = count;
            count3 = count1;
            count1 = count2 + count3;
            count = count3;
        }
        int result = count1 + count;
        return (result * result);

    }
}

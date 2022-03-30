package Dvide_Conqure;

import java.util.Scanner;
import java.util.Set;

public class FindClosestNoOfkNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,4,5,8,10,11};

        int k =7 ;// sc.nextInt();
        int current_diff;
        int min_diff = 0;
        int min = 0;
        for (int i = 0; i <args.length ; i++) {
            current_diff = Math.abs(arr[i] - k);
            if(min_diff > current_diff){
                min_diff = current_diff;
                min = arr[i];
            }
            System.out.print(min+" ");
        }
    }
}

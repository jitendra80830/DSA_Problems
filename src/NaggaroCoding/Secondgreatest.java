package NaggaroCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Secondgreatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        secondGreatestNumber(arr);
    }

    private static void secondGreatestNumber(int[] arr) {
        int counter = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            counter++;
            if(counter == 2){
                System.out.print(arr[i]);
                break;
            }

        }

    }
}

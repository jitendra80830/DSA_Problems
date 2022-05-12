package Stringpck;

import java.util.Arrays;
import java.util.Scanner;

public class Guesspass {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int arr[]  = new int[1000005];
        Arrays.fill(arr , -1);
        String str = sc.next();
        p(str ,arr);
        int i = arr[str.length()];
        while (i!=0){
            for (int j = 0; j <str.length() ; j++) {
                if(arr[j] == i){
                    System.out.println(str.substring( 0 ,i));
                    return;
                }
            }
            i = arr[i];
        }
        System.out.println("Not So Cool");
        return;
    }

    private static void p(String str, int[] arr) {
        int i =0;
        int j =-1;
        while (i < str.length()){
            while (j >=0 && str.charAt(i) !=str.charAt(j)){
                j = arr[j];
            }
            i++;
            j++;
            arr[i] = j;
        }
    }
}

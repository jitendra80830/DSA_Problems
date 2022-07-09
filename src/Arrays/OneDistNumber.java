package Arrays;

import java.util.Scanner;

public class OneDistNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[10];
        for (int i = 0; i <n ; i++) {
            freq[arr[i]]++;
        }
        int uniqueVal = 0;
        for (int i = 0; i <10 ; i++) {
            if(freq[i] == 1){
                uniqueVal = i;
                //System.out.print(i);
            }
        }
    }
}

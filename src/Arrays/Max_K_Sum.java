package Arrays;

import java.util.Scanner;

//Sliding Window protocol
public class Max_K_Sum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]  = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i =0;i<k;i++){
            sum+=arr[i];
        }
        max = sum;
        for(int i = k;i<n;i++){
            sum = sum+arr[i] - arr[i-k];
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);


    }
}
//https://codeforces.com/problemset/submit
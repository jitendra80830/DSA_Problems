package Graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GraphFalling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i] > n-1){
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.print("Yes");
        }else {
            System.out.println("No");
        }
    }
}

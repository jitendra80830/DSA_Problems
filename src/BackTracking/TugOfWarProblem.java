package BackTracking;

import java.util.Scanner;

public class TugOfWarProblem {
    static boolean curr_ele[];
    static boolean isPossible;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            tugOfWar(arr , n);

        }
    }

    private static void tugOfWar(int[] arr, int n) {
        curr_ele = new boolean[n];
        int totalSum = 0;
        isPossible = false;
        for (int i = 0; i <n ; i++) {
            totalSum+=arr[i];
            curr_ele[i] = false;
        }
        tugForWarRecursion(arr , n ,0 ,0 ,0,totalSum);
        if(isPossible){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static void tugForWarRecursion(int[] arr, int n, int selected, int curr_Sum, int currPos, int totalSum) {

        if(currPos == n){
            return;
        }
        if(selected > n/2){
            return;
        }
        selected++;
        curr_Sum = curr_Sum + arr[currPos];
        curr_ele[currPos] = true;
        if(selected == n/2){
            int rem_sum = totalSum - curr_Sum;
            if(Math.abs(curr_Sum - rem_sum) == 0){
                isPossible  = true;
            }
        }else {
            tugForWarRecursion(arr , n , selected , curr_Sum , currPos+1 , totalSum);
        }
        //backtrack
        selected--;
        curr_Sum-=arr[currPos];
        curr_ele[currPos] = false;
        tugForWarRecursion(arr , n , selected , curr_Sum ,currPos+1 ,totalSum);

    }
}

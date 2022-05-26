package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JobSequencing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Job arr[] = new Job[n];
        int id ,deadline , profit;
        for (int i = 0; i <n ; i++) {
            id = sc.nextInt();;
            deadline = sc.nextInt();
            profit = sc.nextInt();
            arr[i] = new Job(id , deadline , profit);
        }
        jobSequencing(arr , n);

    }

    private static void jobSequencing(Job[] arr, int n) {
        Arrays.sort(arr, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit - o1.profit;
            }
        });
        int result[] = new int[n];
        boolean slot[] = new boolean[n];

        for (int i = 0; i <n ; i++) {
            for (int j = Math.min(n-1 , arr[i] .deadline)-1; j>=0 ; j--) {
                if (slot[j] == false){
                    result[j] = i;
                    slot[j] = true;
                    break;
                }
            }
        }
        int totalProfit = 0;
        for (int i = 0; i <n; i++) {
            if(slot[i]){
                //System.out.print(arr[result[i]].id+" ");
                totalProfit+= arr[result[i]].profit;
            }
        }
        //System.out.println();
        System.out.println(totalProfit);




    }
}
class Job{
    int id;
    int deadline;
    int profit;
    public Job(int id , int deadline , int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
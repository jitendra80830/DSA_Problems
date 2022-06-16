package QueuePack;

import java.util.Scanner;

public class GastourProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gas[] = new int[n];
        for (int i = 0; i <n ; i++) {
            gas[i] = sc.nextInt();
        }
        int cost[] = new int[n];
        for (int i = 0; i <n ; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println(canCompleteCircuit(gas ,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total_surplus = 0;
        int surplus = 0;
        int S = 0;

        for(int i = 0; i < n; ++i){
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                S = i+1;
            }
        }
        return (total_surplus < 0) ? -1 : S;
    }
}

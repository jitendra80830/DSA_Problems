package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatefoemOPtimize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrival[] = new int[n];
        int dept[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arrival[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            dept[i] = sc.nextInt();
        }
        Arrays.sort(arrival);
        Arrays.sort(dept);
        System.out.println(minimumPlateform(arrival , dept,n));
    }

    private static int minimumPlateform(int[] arrival, int[] dept, int n) {
        int plate = 1;
        int maxPlat  = 1;
        int i = 0;
        int j =0;
        while (i < n &&  j<n){
            if(arrival[i] <= dept[j]){
                plate+=1;
                i++;
            }else {
                j++;
                plate-=1;
            }
            maxPlat = Math.max(maxPlat , plate);
        }
        return maxPlat;
    }
}

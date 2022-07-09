package Greedy;

import java.util.Scanner;

public class MinimusPlateformBruteForce {
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
        //bruteforce
       System.out.println( minimumPlateform(arrival , dept , n));
    }

    private static int minimumPlateform(int[] arrival, int[] dept, int n) {
        int plate =1;
        int maxPlate = Integer.MIN_VALUE;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arrival[i] >= arrival[j] && arrival[i] <= dept[j]){
                    plate+=1;
                }
                if(arrival[j] >= arrival[i] && arrival[j] <= dept[i]){
                    plate+=1;
                }
            }
            if(maxPlate < plate){
                maxPlate = plate;
            }
            plate = 0;

        }
        return maxPlate;

    }
}

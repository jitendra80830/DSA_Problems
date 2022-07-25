package Stringpck;

import java.util.Scanner;

public class SlowestKey {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int releaseTimes[] = new int[n];
        for (int i = 0; i <n ; i++) {
            releaseTimes[i] = sc.nextInt();
        }
        String keysPressed = sc.next();
        System.out.println(slowestKey(releaseTimes , keysPressed));
    }

    private static char slowestKey(int[] releaseTimes, String keysPressed) { //wrong output
        char ch = keysPressed.charAt(0);

        int n = releaseTimes.length;
        //int i = 0;
        int j = 1;
        int maxVal = releaseTimes[0];
        while (j <n){
            int currMax = releaseTimes[j] - releaseTimes[j-1];
            if(currMax >= maxVal){
                maxVal = currMax;
                ch = keysPressed.charAt(j);
            }
            j++;
        }
        return ch;
    }
}

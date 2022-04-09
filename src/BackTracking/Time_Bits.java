package BackTracking;

import java.util.*;

public class Time_Bits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time_Bits m= new Time_Bits();
        m.readBinary(n);

    }
    public void readBinary(int n) {
        int[] arr = {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
        timeBits(arr, 0, 0, 0, n);
    }

    public void timeBits(int[] arr, int index, int hrs, int min, int n) {
        if (n == 0) {

            if(hrs <= 11 && min <= 59) {
                StringBuilder builder = new StringBuilder();
                builder.append(hrs).append(":").append(min <= 9 ? "0" + min : min);
                System.out.print(" "+builder.toString());
            }
            return;
        }

        for (int i = arr.length-1; i >= index; i--) {
            if (isValid(i)) {
                hrs += arr[i];
            }else {
                min += arr[i];
            }
            timeBits(arr, i + 1, hrs, min, n - 1);

            //backTrack
            if (isValid(i)) {
                hrs -= arr[i];

            }else {
                min -= arr[i];
            }
        }
    }

    public boolean isValid(int position) {
        return position >= 0 && position <= 3;
    }

}
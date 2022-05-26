package Dvide_Conqure;

import java.util.Arrays;
import java.util.Scanner;

public class StickBundle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] ar = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            max = Math.max(max, ar[i]);
        }
        int right = max;
        int left = 0;
        int ans = 0;
        while (left <= right) {
            long count = 0;
            int mid = left + (right - left) / 2;
            for (int i = 0; i < n; i++) {
                count += (long) ar[i] / mid;
            }
            if (count >= k) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}

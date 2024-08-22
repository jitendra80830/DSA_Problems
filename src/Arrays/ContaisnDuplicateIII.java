package Arrays;
/*return true if there are two distinct indices i and j
in the array such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.
*/

import java.util.Scanner;

public class ContaisnDuplicateIII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(containsNearbyAlmostDuplicate(arr , k , t));
    }

    private static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) <= t && Math.abs(i - j) <= k) {
                    flag = 1;
                }
                if (flag == 1) {
                    break;
                }
            }
            if (flag == 1) {
                break;

            }

        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
}

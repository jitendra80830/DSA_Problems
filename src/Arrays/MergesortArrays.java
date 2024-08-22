package Arrays;

import java.util.Scanner;

public class MergesortArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums1[] = new int[m + n];
        int nums2[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            nums2[i] = sc.nextInt();
        }
        int ans[] = merge2(nums1 , m, nums2 , n);
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
        while (p2 >= 0){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }else{
                nums1[i--] = nums2[p2--];
            }
        }
        return nums1;
    }


}

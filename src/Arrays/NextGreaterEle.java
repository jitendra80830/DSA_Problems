package Arrays;

import java.util.Scanner;

public class NextGreaterEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nums1[] = new int[n];
        int nums2[] = new int[m];
        for (int i = 0; i <n ; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            nums2[i] = sc.nextInt();
        }
        int arr[] = findNextGreater(nums1 , nums2);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] findNextGreater(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans[] = new int[n];
        for (int i = 0; i <n ; i++) {
            int flag = 0;
            for (int j = 0; j <m-1 ; j++) {
                if(nums1[i] == nums2[m-1]){
                    ans[i] = -1;
                }else{
                    if(nums1[i] == nums2[j]){
                        for (int k = j+1; k <m ; k++) {
                            if(nums2[k] > nums1[i]){
                                ans[i] = nums2[k];
                                flag = 1;
                                break;

                            }
                        }


                    }
                }

            }
            if(flag == 0){
                ans[i] = -1;
            }
        }
        return ans;
    }
}

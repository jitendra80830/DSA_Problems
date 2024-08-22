package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class IntersectionTwoArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums1[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int nums2[] = new int[m];
        for (int i = 0; i <m ; i++) {
            nums2[i] = sc.nextInt();
        }
        int ans[] = intersect(nums1 , nums2);
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer , Integer> map = new HashMap<>();
        HashMap<Integer , Integer> map2 = new HashMap<>();
        for (int i = 0; i <nums1.length ; i++) {
            if(map.containsKey(nums1[i])){
                map.put(nums1[i] ,map.get(nums1[i])+1);
            }else {
                map.put(nums1[i] , 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <nums2.length ; i++) {
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i] ,map2.get(nums2[i])+1);
            }else {
                map2.put(nums2[i] , 1);
            }
        }
        for (Integer key : map.keySet()){
            if(map2.containsKey(key)){
                int x = Math.min(map.get(key) , map2.get(key));
                while (x-->0){
                    list.add(key);
                }
            }
        }
        int arr[] = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            arr[i] = list.get(i);
        }

//        for (int i = 0; i <nums2.length ; i++) {
//            if(map.containsKey(nums2[i])){
//                if(map.get(nums2[i]) > 0){
//                    list.add(nums2[i]);
//                    map.put(nums2[i] , map.get(nums2[i] - 1));
//
//                }
//            }
//        }
        return arr;
    }
}

package Greedy;

import java.util.*;

public class LongestSubSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int arrA[] = new int[n];
            for (int i = 0; i <n ; i++) {
                arrA[i] = sc.nextInt();
            }

            HashMap<Integer , Integer> mp = new HashMap<>();
            for (int i = 0; i <n ; i++) {
                if(mp.containsKey(arrA[i])){
                    mp.put(arrA[i] , mp.get(arrA[i])+ 1);
                }else {
                    mp.put(arrA[i] , 1);
                }
            }
            System.out.println(mp.size());
            lis(arrA);
        }
    }

    private static void lis(int[] arrA) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arrA.length ; i++) {
            set.add(arrA[i]);
        }
        System.out.println(set.size());
    }
}
//https://www.geeksforgeeks.org/longest-increasing-sub-sequence-formed-by-concatenating-array-to-itself-n-times/
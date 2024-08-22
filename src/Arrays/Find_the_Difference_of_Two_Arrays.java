package Arrays;

import java.util.*;

public class Find_the_Difference_of_Two_Arrays {
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
        System.out.println(findDifference(nums1 , nums2));
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i <nums1.length ; i++) {
            s1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length ; i++) {
            s2.add(nums2[i]);
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (Iterator<Integer> it = s1.iterator();it.hasNext();){
            int val = it.next();
            if(!s2.contains(val)){
                l1.add(val);
            }
        }
        for (Iterator<Integer> t = s2.iterator();t.hasNext();){
            int val = t.next();
            if(!s1.contains(val)){
                l2.add(val);
            }
        }
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}

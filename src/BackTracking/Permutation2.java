package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(permute(arr));
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();
        permuteBackTrack(res , nums , curr , visited);
        return res;
    }

    private static void permuteBackTrack(List<List<Integer>> res, int[] nums, List<Integer> curr, boolean[] visited) {
        if(curr.size() == nums.length){
            if(!res.contains(curr)){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        for (int i = 0; i < nums.length ; i++) {
            if(visited[i]){
                continue;
            }
            curr.add(nums[i]);
            visited[i] = true;
            permuteBackTrack(res ,nums , curr , visited);
            curr.remove(curr.size()-1);
            visited[i] = false;
        }
    }
}

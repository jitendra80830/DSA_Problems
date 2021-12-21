package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args){
        int arr[]  = {2 ,4, 1, 3 ,6 ,3, 2, 6};
        ArrayList<Integer> list = new ArrayList<>();
        //subset_Ele(arr , 0,0 , list);
        ArrayList<Integer> ans = subsetSum(arr ,arr.length);
        int sum =0 ;
        for(int i =0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        System.out.println(sum);

    }
//    public static void subset_Ele(int ques[] , int i, int sum, ArrayList<Integer> list){
//        if(i==ques.length){
//            System.out.println(sum);
//            list.add(sum);
//            return;
//        }
//
//        subset_Ele(ques,i+1,(sum+ques[i]) , list);
//        subset_Ele(ques,i+1,sum , list);
//    }
    public static ArrayList<Integer> subsetSum(int[] arr , int n){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        subset_Ele(0 ,0 ,arr , n , sumSubset);
        return sumSubset;
    }

    public static void subset_Ele(int idx, int sum, int [] arr, int n, ArrayList<Integer> sumSubset) {
        if(idx == n){
            sumSubset.add(sum);
            return;
        }
        subset_Ele(idx+1 , sum + arr[idx],arr , n , sumSubset );
        subset_Ele(idx+1 , sum , arr , n , sumSubset);

    }

}

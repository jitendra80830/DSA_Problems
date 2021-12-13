package Recursion;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args){
        int arr[]  = {2 ,4 ,1, 3, 6, 3, 2, 6};
        ArrayList<Integer> list = new ArrayList<>();
        subset_Ele(arr , 0,0 , list);

    }
    public static void subset_Ele(int ques[] , int i, int sum, ArrayList<Integer> list){
        if(i==ques.length){
            System.out.println(sum);
            list.add(sum);
            return;
        }

        subset_Ele(ques,i+1,(sum+ques[i]) , list);
        subset_Ele(ques,i+1,sum , list);
    }
}

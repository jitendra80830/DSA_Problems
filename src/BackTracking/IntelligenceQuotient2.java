package BackTracking;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntelligenceQuotient2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        coinCombination_2_Use2D(arr,0,amount,list,ans);
        //System.out.println(ans);
        for (int i = 0; i <ans.size() ; i++) {
            for (int j = 0; j <ans.get(i).size() ; j++) {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
    public static void coinCombination_2_Use2D(int coin [], int last_index, int amount, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if(amount == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i= last_index;i<coin.length;i++){
            if(i!=last_index && coin[i]==coin[i-1])
                continue;
            if(amount>=coin[i]) {
                list.add(coin[i]);

                coinCombination_2_Use2D(coin, i + 1, amount - coin[i], list,ans);
                list.remove(list.size()-1);
            }
        }
    }
}

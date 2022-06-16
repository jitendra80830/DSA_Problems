package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinsChangeCombination {
    public static void main(String[] args){
        int [] coins = {10, 20 ,3 ,45, 2, 3, 45};
        int amount = 30;
        Arrays.sort(coins);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        coinChangeCombination(coins,0,amount,list,ansList);
        for (int i = 0; i <ansList.size() ; i++) {
            for (int j = 0; j <ansList.get(i).size() ; j++) {
                System.out.print(ansList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void coinChangeCombination(int coin [], int last_index , int amount, ArrayList<Integer> list , ArrayList<ArrayList<Integer>> ansList){

        if(amount==0){
            if(!ansList.contains(list)) {
                ansList.add(new ArrayList<>(list));
            }

            return;
        }

        for(int i=last_index;i<coin.length;i++){
            if(amount>=coin[i]){
                list.add(coin[i]);
                coinChangeCombination(coin,i,amount-coin[i],list,ansList);
                list.remove(list.size()-1);
            }
        }
    }

}


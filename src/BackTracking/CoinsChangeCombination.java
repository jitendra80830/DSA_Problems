package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinsChangeCombination {
    public static void main(String[] args){
        int [] coins = {1,2,3,4,5};
        int amount = 4;
        Arrays.sort(coins);
        ArrayList<Integer> list = new ArrayList<>();
        coinChangeCombination(coins,0,amount,list);
    }
    public static void coinChangeCombination(int coin [], int last_index , int amount, ArrayList<Integer> list){
        if(amount==0){
            for (int i = 0; i <list.size() ; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();

            return;
        }

        for(int i=last_index;i<coin.length;i++){
            if(amount>=coin[i]){
                list.add(coin[i]);
                coinChangeCombination(coin,i,amount-coin[i],list);
                list.remove(list.size()-1);
            }
        }
    }

}


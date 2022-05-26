package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKmapsack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float cap = sc.nextFloat();
        float wt[] = new float[n];
        float profit[] = new float[n];

        Product ratio[] = new Product[n];

//        int i =0;
//        while (i<n){
//            profit[i] = sc.nextFloat();
//            wt[i] = sc.nextFloat();
//            i++;
//        }
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextFloat();
        }




        for (int j = 0; j <n ; j++) {
            ratio[j] = new Product(wt[j] , profit[j]);

        }
        fractionalKnapsack(ratio , cap , n);



    }

    private static void fractionalKnapsack(Product[] ratio, float cap, int n) {
        //first sort increasing order according to profit
        Arrays.sort(ratio, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.pw < o2.pw){
                    return -1;
                }
                else if(o1.pw > o2.pw){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        int flag = 0;
        float totalProfit = 0;
        int i = 0;
        for ( i = n-1; i >=0 ; i--) { // loop from back because sorted increasing order
            float currentwt = ratio[i].wt;
            float currentProfit = ratio[i].profit;
            if(cap >0 && currentwt <= cap ){
                cap = cap - currentwt;
                totalProfit  += currentProfit;
            }else {
                // if capciti is not >0 and currentwt not <= cap the flag =1 and break and print profit below
                flag = 1;
                break;
            }

        }
        if(flag ==1){
            totalProfit += ratio[i].profit * (cap /ratio[i].wt);
        }
        System.out.println( totalProfit);
    }
}
class Product{
    float wt;
    float profit;
    float pw;
    public Product(float w , float p){
        wt = w;
        profit = p;
        pw = p/w;
    }
}


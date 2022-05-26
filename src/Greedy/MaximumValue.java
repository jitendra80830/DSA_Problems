package Greedy;

import java.io.IOException;
import java.util.Comparator;
import java.util.*;

public class MaximumValue  {
    static class Item{
        float wt;
        float value;
        //float ratio;
        Item(float value,float wt){
            this.wt=wt;
            this.value=value;
            //ratio=this.value/this.wt;
        }
    }
    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float maxCapacity=sc.nextFloat();
        Item it[]=new Item[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();//val
            int b=sc.nextInt();//wt
            it[i]=new Item(a,b);
        }
        Arrays.sort(it,new Comparator<Item>(){
            public int compare(Item a,Item b){
                if((a.value/a.wt)>(b.value/b.wt)){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
        float res=0;
        for(int i=0;i<n;i++){
            float w=Math.min(it[i].wt,maxCapacity);
            maxCapacity=maxCapacity-w;
            res+=(w*(it[i].value/it[i].wt));
        }
        System.out.println(Math.round(res));
    }
}

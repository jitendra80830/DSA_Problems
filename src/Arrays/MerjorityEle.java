package Arrays;

import java.util.HashMap;

public class MerjorityEle {


    public static void main(String args[]){

        int arr[]={2,4,3,3,2,2};

        HashMap<Integer,Integer>hm=new HashMap<>();


        int size=arr.length;
        int result=-1;

        for(int i=0;i<size;i++){
            if(hm.containsKey(arr[i])){
                int val=hm.get(arr[i])+1;
                hm.put(arr[i],val);
                if(val>size/2){
                 result=arr[i];
                }
            }else{
                hm.put(arr[i],1);
            }
        }

        System.out.println(result);
    }


}

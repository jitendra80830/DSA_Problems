package BackTracking;

import java.util.*;
import java.io.*;
public class Intelijence2 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        candi(arr , 0 , v , 0 , new ArrayList<>());
    }
    public static void candi(int[] arr , int index , int v , int res , ArrayList<Integer> list){
        if(res == v){
            // Collections.sort(list);
            for(int i = 0;i<list.size();i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }
        if(res>v){
            return;
        }
        if(index == arr.length){
            return;
        }
        for(int i = index;i<arr.length;i++){
            if(i-1>=index && arr[i]==arr[i-1]){
                continue;
            }
            // System.out.println(arr[i]);
            list.add(arr[i]);
            candi(arr , i + 1 , v , res+arr[i] , list);
            list.remove(list.size()-1);
        }
        // candi(arr , index+1 , v , res , list);
    }
}

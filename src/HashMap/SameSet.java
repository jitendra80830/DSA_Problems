package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SameSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            brr[i] = sc.nextInt();
        }
        //HashSet<Integer> set = new HashSet<>();
        HashMap<Integer ,  Integer> map = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if(map.get(arr[i]) == null){
                map.put(arr[i],1 );
            }else {
                map.put(arr[i],map.get(arr[i]) + 1 );
            }
        }
        boolean flag = true;
        for (int i = 0; i <n ; i++) {
            // if there is element in arr2 but not in arr1
            if (!map.containsKey(brr[i])){
                flag = false;
                break;
            }
            //if an element of arr2 appears more times than it appears in arr1
            if(map.get(brr[i]) == 0){
                flag = false;
                break;
            }
            map.put(brr[i] , map.get(brr[i]) - 1);
        }
        if(flag == true){
            System.out.println("Both array same set of elements");
        }else {
            System.out.println("Both array not same set of elements");
        }

    }
}

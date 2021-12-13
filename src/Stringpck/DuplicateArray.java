package Stringpck;

import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        int n = str.length();
        for(int i =0;i<n;i++){
            int count = 1;
            for(int j =i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count >=2){
                System.out.print(arr[i]+"="+count);
            }

        }

    }
}

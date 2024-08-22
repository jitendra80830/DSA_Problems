package Stringpck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Find_Common_Characters_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i <n ; i++) {
            str[i] = sc.next();
        }
       System.out.println(commonChars(str));
    }

    private static List<String> commonChars(String[] words) {
        int common[] = new int[26];
        Arrays.fill(common ,Integer.MAX_VALUE);
        for (String word : words){
            int cont[] = new int[26];
            for (char c : word.toCharArray()){
                cont[c - 'a']++;
            }
            for (int i = 0; i <26 ; i++) {
                common[i] = Math.min(common[i] , cont[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <26 ; i++) {

            for (int j = 0; j <common[i] ; j++) {
                ans.add(""+(char)('a'+i));
            }
        }
        return ans;
    }
}

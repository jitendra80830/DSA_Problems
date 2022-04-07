package BackTracking;

import java.util.Scanner;

public class ManInMiddleHacked {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        manInMiddlehacked(str , sb , 0);
    }

    private static void manInMiddlehacked(String str, StringBuilder sb, int i) {
        if(i == str.length()){
            System.out.println(sb);
            return;
        }
        if(Character.isAlphabetic(str.charAt(i))){
            if(Character.isUpperCase(str.charAt(i))){ // if upper case then convert into lowercase
                sb.setCharAt(i , Character.toLowerCase(str.charAt(i)));
            }else {
                sb.setCharAt(i , Character.toUpperCase(str.charAt(i))); //if not upper case means lower case then convert into upper case
            }
            manInMiddlehacked(str , sb , i+1); //call for next index
            sb.setCharAt(i , str.charAt(i)); //backtrack again set previes string
        }
        manInMiddlehacked(str , sb , i+1); // gain call after back track
    }
}

package Stringpck;

import java.util.Scanner;

public class AddTwoNumericalString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); //taking input
        String str2 = sc.next();

        if(str1.length() > str2.length()){ //swap if str1>str2
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        str1 = new StringBuilder(str1).reverse().toString(); //reverse str1
        str2 = new StringBuilder(str2).reverse().toString(); // reverse str2

        int n1 = str1.length();
        int n2 = str2.length();
        int carry = 0;
        String result = "";

        for(int i =0;i<n1;i++){ //perform addition
            int sum = ((str1.charAt(i) - '0') + (str2.charAt(i) - '0') + carry); //taking both's string index values to sum
            result = result.concat(String.valueOf((char) (sum%10 + '0'))); //sum
            carry = sum /10; //find carry

        }
        for(int i =n1;i<n2;i++){ // perform on remaining n2
            int sum = ((str2.charAt(i) - '0') + carry);
            result = result.concat(String.valueOf((char) (sum%10 + '0')));
            carry = sum /10;

        }
        if(carry > 0){ // after perform if remaining carry then
            result = result.concat(String.valueOf((char) (carry%10 + '0')));

        }
        result = new StringBuilder(result).reverse().toString(); //reverse fina values
        System.out.println(result);
    }
}

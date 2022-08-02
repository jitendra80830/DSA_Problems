package Stringpck;

import java.util.Scanner;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sentences[] = new String[n];

        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }
        System.out.println(mostWordsFound(sentences));
    }

    private static int mostWordsFound(String[] sentences) {
        int maxLen = 0;
        int currMax = 0;
        for (String s : sentences){
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i) == ' '){
                    currMax++;
                }
            }
            maxLen = Math.max(currMax,maxLen);
            currMax = 0;
        }
        return maxLen + 1;

    }
}

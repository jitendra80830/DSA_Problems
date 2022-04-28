package Greedy;

import java.util.Scanner;
import java.util.Vector;

public class MimNoOfSwap_For_BracketsBalance {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int n = 2 *len;
        String str = sc.next();

        Vector<Integer> vt = new Vector<>();

        for (int i = 0; i <n ; i++) {
            if(str.charAt(i) == '['){
                vt.add(i);
            }
        }
        int idx = 0;
        int ans = 0;
        int counter = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i <n ; i++) {
            if(ch[i] == '['){
                counter++;
                idx++;
            }else {
                counter--;
                if(counter < 0){
                    ans+=vt.get(idx) - i;
                    char temp = ch[i];
                    ch[i] = ch[vt.get(idx)];
                    ch[vt.get(idx)] =temp;
                    counter = 1;
                    idx++;
                }
            }

        }
        System.out.println(ans);

    }

}

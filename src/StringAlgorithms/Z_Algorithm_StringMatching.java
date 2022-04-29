package StringAlgorithms;

import java.util.Scanner;

public class Z_Algorithm_StringMatching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        z_Algo(text , pattern);
    }

    private static void z_Algo(String text, String pattern) {
        int n = pattern.length();
        String st = pattern + "$" + text;
        int len = st.length();
        int z[] = new int[len];
        createZArray(st , z);
        for (int i = 0; i <len ; i++) {
            if(z[i] == n){
                System.out.println("pattern match at index "+ (i-(n+1)));
            }
            
        }
    }

    private static void createZArray(String st, int[] z) {
        int n = st.length();
        int l = 0;
        int r = 0;
        char con[] = st.toCharArray();
        for (int i = 1; i <n ; i++) {
            if(i>r){
                r = i;
                l = i;
                while (r < n && con[r-l] == con[r]){
                    r+=1;
                }
                z[i] = r-l;
                r-=1;
            }else {
                int k =i-l;
                if(z[k]  <  r-i+1){
                    z[i] = z[k];
                }else {
                    l = i;
                    while (r < n && con[r-l] == con[r]){
                        r+=1;
                    }
                    z[i] = r-l;
                    r-=1;
                }
            }

        }
    }
}

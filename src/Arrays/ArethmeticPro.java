package Arrays;

import java.util.*;
import java.io.*;
public class ArethmeticPro {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a1[] = new int[100001];
        int a2[] = new int[100001];
        int b1[] = new int[100001];
        int n = sc.nextInt();
        int a;
        int o=0;
        for(int i=1;i<=n;++i) {
            a = sc.nextInt();
            if(b1[a]>0)
                continue;
            if(a1[a]>0) {
                if(a2[a] < 1)
                    a2[a]=i-a1[a];
                else if(a2[a]!=i-a1[a])
                {
                    b1[a]=1;--o;
                }
            }
            else ++o;
            a1[a]=i;
        }
        System.out.println(o);
        for(int i=1;i<100001;++i)
            if(a1[i]>0 && b1[i]<1)
                System.out.println(i + " " + a2[i]);
    }
}

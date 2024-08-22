package Array2D;

import java.util.Scanner;

public class MirrorReflection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println(mirrorReflection(p  , q));


    }

    private static int mirrorReflection(int p, int q) {
        int ext = q ;
        int reflection = p;

        while (ext %2 ==0 && reflection %2 == 0){
            ext/=2;
            reflection/=2;
        }
        if(ext%2 ==0 && reflection%2!=0){
            return 0;
        }
        if(ext%2==1 && reflection%2==0){
            return 2;
        }
        if(ext%2==1 && reflection%2!=0){
            return 1;
        }
        return 1;

    }
}

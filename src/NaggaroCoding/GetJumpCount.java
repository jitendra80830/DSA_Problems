package NaggaroCoding;

import java.util.Scanner;

public class GetJumpCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();//no of meter he can hump up
        int input2 = sc.nextInt();//no of meter he can jump down
        int input3 = sc.nextInt();//no of walls he need to jump escape

        int input4[] = new int[input3];//height of the each walls
        for (int i = 0; i <input3 ; i++) {
            input4[i] = sc.nextInt();
        }
        System.out.println(getJumpCount(input1 , input2 , input3 ,input4));
    }

    private static int getJumpCount(int input1, int input2, int input3, int[] input4) {

        int count = 0;
        for (int i = 0; i <input3 ; i++) {
            int n = input4[i] / (input1 - input2);
            int rem = input4[i] % (input1 - input2);
            if(rem > input2){
                count+=n+1;
            }else {
                count+=n;
            }
        }
        return count;
    }
}

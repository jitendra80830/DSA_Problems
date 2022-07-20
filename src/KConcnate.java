import java.util.Scanner;

public class KConcnate {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3};
        int newArr[] = new int[2*(arr.length)];
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = arr[i% arr.length];

        }
        for (int i = 0; i < newArr.length ; i++) {
            System.out.print(newArr[i]+" ");
        }

    }

}

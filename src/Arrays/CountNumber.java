package Arrays;

public class CountNumber {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,1,2,4,5,7,8,8,1,3,4};
        int freq[] = new int[16];
        for (int i = 0; i <16 ; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < 16 ; i++) {
            if(freq[i]!=0){
                System.out.print("freq of "+i+" : "+freq[i]);
                System.out.println();
            }

        }
    }
}

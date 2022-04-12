package KardanlasAlgo;

public class MaximumSubArray {
    public static void main(String[] args){
        int arr[]  = {10,-20,35,40,10,-10,-100,-50};
        maxsunArray1(arr); //brute force tc = O(n3)
        masubArray2(arr);//O(n2)
        KadanesAlgo(arr); // using dynamic programming tc = O(n)

    }

    private static void KadanesAlgo(int[] arr) {
        int n = arr.length;
        int maxSoFar = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i <n ; i++) {
            maxSoFar = Math.max(arr[i] , maxSoFar + arr[i]);
            if(maxSoFar > maxSum) {
                maxSum = maxSoFar;
            }
        }
        System.out.println(maxSum);

    }

    private static void masubArray2(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            int curr_Sum = 0;
            for (int j = i; j <n ; j++) {
                curr_Sum+=arr[j];
                if(curr_Sum > maxSum){
                    maxSum = curr_Sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    private static void maxsunArray1(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) { //for stating point
            for (int j = i; j <n ; j++) { //for ending point
                int curr_sum = 0;
                for (int k = i; k <=j ; k++) { // for add elements between two points means subArray sum
                    curr_sum+=arr[k];

                }
                if(curr_sum > maxSum){
                    maxSum = curr_sum;
                }

            }

        }
        System.out.println(maxSum);
    }
}

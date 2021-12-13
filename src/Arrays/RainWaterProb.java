package Arrays;

public class RainWaterProb {
    public static void main(String[] args){
        int arr[] = {0,1,2,0,0,3,1,0,3};
        rainWater1(arr);
        rainWater2(arr);

    }
    public static void rainWater1(int arr[]){
        int n = arr.length;
        int rmax = arr[n-1];
        int lmax = arr[0];
        int water = 0;
        for(int i =1;i<n-1;i++){
            for(int j = i;j>=0;j--){
                if(arr[i]>lmax) {
                    lmax = arr[j];
                }
            }
            for(int j = i;j<n;j++){
                if(arr[i]>rmax){
                    rmax = arr[j];
                }
            }
            water += Math.min(lmax , rmax) - arr[i];

        }
        System.out.print(water);

    }
    //optimize
    public static void rainWater2(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        left[0] = arr[0];
        int right[] = new int[n];

        int water = 0;
        for(int i =1;i<n-1;i++){
            if(arr[i] > left[i-1]){
                left[i] = arr[i];
            }else {
                left[i] = arr[i-1];
            }
        }
        for(int i =n-1;i>=0;i--){
            if(arr[i] > right[i+1]){
                right[i] = arr[i];
            }else {
                right[i] = arr[i+1];
            }
        }
        for(int i =1;i<n-1;i++){
            water += Math.min(left[i] , right[i]) - arr[i];
        }
        System.out.println(water);


    }
}

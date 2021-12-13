package Sorting;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        int arr1[] = {2,3,5,8,9,11,12,13};
        int arr2[] = {1,2,3,4,5,7,9};
        int ans[] = mergeTwoSortedArray(arr1 , arr2);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] mergeTwoSortedArray(int arr1[] , int arr2[]){
        int i =0; // for arr1
        int j =0; // for arr2
        int c[] = new int[arr1.length+arr2.length];
        int k = 0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                c[k] = arr1[i];
                i++;
                k++;
            }else {
                c[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i<arr1.length){ // for remaining arr1 elements
            c[k] = arr1[i];
            i++;
            k++;

        }
        while (j<arr2.length){ // for remaining arr2 elements
            c[k] = arr2[j];
            j++;
            k++;
        }
        return c;
    }
}

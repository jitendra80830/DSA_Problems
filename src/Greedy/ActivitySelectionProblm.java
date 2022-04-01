package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActivitySelectionProblm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start[] = new int[n];
        int finish[] = new int[n];
        for (int i = 0; i <n ; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            finish[i] = sc.nextInt();
        }
        ArrayList<Pairss> arr = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            arr.add(new Pairss(start[i] , finish[i]));

        }
        activitySelection(arr , n);

    }

    private static void activitySelection(ArrayList<Pairss> arr, int n) {
        arr.sort(new Comparator<Pairss>() {
            @Override
            public int compare(Pairss o1, Pairss o2) {
                return o1.y - o2.y;
            }
        });
        ArrayList<Integer> selected = new ArrayList<>();
        int i =0; //i is finish index and j is start index
        selected.add(i);
        for (int j = 1; j <n ; j++) {
            if(arr.get(j).x >= arr.get(i).y){
                selected.add(j);
                i = j;
            }
        }
        for (int j = 0; j <selected.size() ; j++) {
            System.out.print(selected.get(j)+" ");
        }
        System.out.println();


    }
}
class Pairss{
    int x;
    int y;
    public Pairss(int i , int j){
        x = i;
        y = j;
    }

}

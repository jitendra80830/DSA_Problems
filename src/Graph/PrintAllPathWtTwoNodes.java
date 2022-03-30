package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPathWtTwoNodes {
    static ArrayList<Integer> path;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        path = new ArrayList<>();
        int nodes = sc.nextInt();;
        int edges = sc.nextInt();
        int arr[][] = new int[nodes][nodes];
        for (int i = 0; i <edges; i++) {
            int u  = sc.nextInt();
            int v = sc.nextInt();
            arr[u][v] = 1;
        }
        int scr = sc.nextInt();;
        int dest = sc.nextInt();
        int visited[] = new int[100005];
        printAllPath(nodes , scr , dest , visited , arr);
    }

    private static void printAllPath(int nodes ,int scr, int dest, int[] visited, int[][] arr) {
        path.add(scr); // add scr in path array
        visited[scr] = 1; // make visited
        if(scr == dest){ // if src==dest then print path array
            for(int element : path){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < nodes; i++) { // for addjs elements
            if(arr[scr][i] == 1 && visited[i] == 0){ // if addj element and not visited that node then call
                printAllPath(nodes , i , dest , visited , arr);
            }

        }
        path.remove(path.size() -1); // remove last element for print other path also
        visited[scr] = 0; // make unvisited for print ather path also

    }
}

package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AddjListRpresent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<ArrayList<Integer>> addjList = new ArrayList<>();
        for (int i = 0; i <nodes ; i++) {
            addjList.add(new ArrayList<>());

        }
        for (int i = 0; i <edges ; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdges(addjList , u , v);
            
        }
        for (int i = 0; i <nodes ; i++) {
            System.out.println("addjList of "+i+" is");
            for (int j = 0; j < addjList.get(i).size(); j++) {
                System.out.print(addjList.get(i).get(j)+" ");

            }
            System.out.println();

            
        }
    }



    private static void addEdges(ArrayList<ArrayList<Integer>> addjList, int u, int v) {
        addjList.get(u).add(v);
        addjList.get(v).add(u);

    }
}

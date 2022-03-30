package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeihtGraphWithList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<ArrayList<Edges>> addjlist = new ArrayList<>();
        for (int i = 0; i <nodes ; i++) {
            addjlist.add(new ArrayList<>());

        }
        for (int i = 0; i <edges ; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            addEdges(addjlist , u , v ,w);

        }
        for (int i = 0; i <nodes ; i++) {
            System.out.println("Addjlist is vertex of "+i+" is");
            for (int j = 0; j <addjlist.get(i).size(); j++) {
                System.out.println(addjlist.get(i).get(j).dest+" and wt is "+addjlist.get(i).get(j).wt);

            }

        }
    }

    private static void addEdges(ArrayList<ArrayList<Edges>> addjlist, int u, int v, int w) {
        addjlist.get(u).add(new Edges(v , w));
        addjlist.get(v).add(new Edges(u ,w));
    }
}
class Edges{
    int dest;
    int wt;
    Edges(int des , int wt){
        this.dest = des;
        this.wt = wt;
    }
}

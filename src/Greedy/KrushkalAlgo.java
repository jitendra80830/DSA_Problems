package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class KrushkalAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<Edgess> graph = new ArrayList<>();
        int src , dest , wt;
        for (int i = 0; i <e ; i++) {
            src = sc.nextInt();
            dest = sc.nextInt();
            wt = sc.nextInt();
            graph.add(new Edgess(src  ,dest , wt));
        }
        ArrayList<Edgess> result = krushalsAlgo(graph , n);
        for(Edgess ele : result){
            System.out.println(ele.src+" "+ele.dest);
        }

    }

    private static ArrayList<Edgess> krushalsAlgo(ArrayList<Edgess> graph, int n) {
        int vertexSet[] = new int[n];
        for (int i = 0; i <n ; i++) {
            vertexSet[i] = i;
        }
        graph.sort(new Comparator<Edgess>() {
            @Override
            public int compare(Edgess o1, Edgess o2) {
                return o1.wt - o2.wt;
            }
        });
        ArrayList<Edgess> result= new ArrayList<>();
        int count  = 0;
        int i =0;
        while (count < n-1){
            Edgess currEdges = graph.get(i);
            int uSet = getSet(currEdges.src , vertexSet);
            int vSet = getSet(currEdges.dest , vertexSet);
            if(uSet!=vSet){
                result.add(currEdges);
                count++;
                vertexSet[vSet]= uSet;
            }
            i+=1;
        }
        return result;

    }

    private static int getSet(int node, int[] vertexSet) {
        if(node == vertexSet[node]){
            return node;
        }
        return getSet(vertexSet[node] , vertexSet);

    }
}
class Edgess{
    int src;
    int dest;
    int wt;
    public Edgess(int u , int v , int w){
        src = u;
        dest = v;
        wt = w;

    }

}

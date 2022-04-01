package Greedy;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class DijksartaAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Edgges>> graph = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i <e ; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int wt = sc.nextInt();
            graph.get(src).add(new Edgges(dest  , wt));
            graph.get(dest).add(new Edgges(src , wt));

        }
        dijkstraAlgo(graph , n , 0);

    }

    private static void dijkstraAlgo(ArrayList<ArrayList<Edgges>> graph, int n, int u) {
        int dist[] = new int[n];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[u] = 0;
        PriorityQueue<Pairs> pq = new PriorityQueue<>(n , new Pairs());
        pq.add(new Pairs(0 , u));
        boolean visited[] = new boolean[n];

        while (!pq.isEmpty()){
            int vt = pq.peek().y; //first node
            pq.remove(); //then remove that node
            if(visited[vt]){ // if visited already then move to next itteration
                continue;
            }else {
                visited[vt] = true; // othervise make visited that node
                for (Edgges ele : graph.get(vt)){ // all addjcent nodes of vt
                    int v = ele.dest; // destination node
                    int w = ele.wt; // wait of node
                    if(dist[v] > dist[vt] + w){
                        dist[v] = dist[vt] + w;
                        pq.add(new Pairs(dist[vt]+w , v));
                    }

                }
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.println("Shortest distance from "+u+" to "+i+" = "+dist[i]);

        }


    }
}
class Edgges{
    int wt;
    int dest;
    public Edgges(int dest , int wt){
        this.wt = wt;
        this.dest = dest;
    }

}
class Pairs implements Comparator<Pairs>{
    int x , y;
    Pairs(){

    }
    Pairs(int i , int j){
        x = i;
        y = j;
    }

    @Override
    public int compare(Pairs o1, Pairs o2) {
        return o2.x - o1.x;
    }
}

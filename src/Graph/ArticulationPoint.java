package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticulationPoint {
    static int parent[];
   static int disc[];
    static int low[];
    static int time;
    static boolean artic[];
    static boolean visited[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i <e ; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        parent = new int[V];
        disc = new int[V];
        low = new int[V];
        time = 0;
        artic = new boolean[V];
        visited = new boolean[V];
        parent[0] = -1;

        dfs(0 ,graph);

        int ans = 0;
        for (int i = 0; i <V ; i++) {
            if(artic[i] == true){
                ans++;
            }
        }
        System.out.print(ans);
    }

    private static void dfs(int u, ArrayList<ArrayList<Integer>> graph) {
        disc[u] = low[u] = time;
        time++;
        int count = 0;

        visited[u] = true;
        ArrayList<Integer> nebr = graph.get(u);
       for (int i =0;i<nebr.size();i++){
           int v = nebr.get(i);
           if(parent[u] == v){
               continue;
           }
           else if(visited[v] == true){
               low[u] = Math.min(low[u],disc[v]);

           }else {
               parent[v] = u; //seting parrent of nebr node
               dfs(v , graph);
               count++;
               low[u] = Math.min(low[u],low[v]);
               if(parent[u] == -1){
                   if(count > 2){
                       artic[u] = true;
                   }

               }else {
                   if(low[v] >= disc[u]){
                       artic[u] = true;
                   }
               }

           }
       }
    }
}

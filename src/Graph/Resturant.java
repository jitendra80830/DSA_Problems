package Graph;


import java.io.IOException;
import java.util.*;

public class Resturant {
    static class Graph {
        private int numberNode;
        private ArrayList<ArrayList<Integer>> adj;
        private boolean visited[];

        Graph(int vertex) {
            numberNode = vertex;
            adj = new ArrayList();
            visited = new boolean[vertex];
            for (int i = 0; i < vertex; i++) {
                adj.add(i, new ArrayList());
            }
        }

        public void addEdge(int start, int end) {
            adj.get(start).add(end);
            adj.get(end).add(start);
        }


        public void countEdges(){
            int count = 0;
            for (int i = 0; i <numberNode ; i++) {
                ArrayList<Integer> node1 = adj.get(i);
                for (Integer node : node1) {
                    count++;
                }
            }
            System.out.println(count/2);
        }
    }

    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            //int E = sc.nextInt();
            //Graph g = new Graph(N);
            Set<Integer> s = new HashSet<>();
            for (int i = 0; i <N; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                s.add(u);
                s.add(v);
                //g.addEdge(u, v);
            }

//            for (int i = 1; i <=N ; i++) {
//                s.add(i);
//            }
            System.out.println(s.size());
            //g.dft();
           // g.dfs(0);
            //g.countEdges();
        }
    }
}


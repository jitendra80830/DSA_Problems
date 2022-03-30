package Graph;

import java.util.*;

public class CycleDetectGraph {
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
            addjList.get(u).add(v);
            addjList.get(v).add(u);

        }
        if(isCycle(addjList , nodes)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static boolean isCycle(ArrayList<ArrayList<Integer>> addjList, int nodes) {
        boolean[] visited = new boolean[nodes]; // boolean array
        for (int i = 0; i <nodes ; i++) {
            //if not vosited and if return true that method mens cycle hai
            if(!visited[i] && isCyclicConnected(addjList , i , nodes , visited)){
                return true;
            }

        }
        return false;
    }

    private static boolean isCyclicConnected(ArrayList<ArrayList<Integer>> addjList, int s, int nodes, boolean[] visited) {
        int[] parent = new int[nodes]; // parent array
        Arrays.fill(parent , -1); // fill prent array with -1
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()){
            int popitem = q.poll(); //poped element
            for (int i = 0; i <addjList.get(popitem).size() ; i++) { // addjcent elements of popitem
                int addjoFpopedIntem = addjList.get(popitem).get(i);
                if(!visited[addjoFpopedIntem]){ // if not visited
                    visited[addjoFpopedIntem] = true;
                    q.add(addjoFpopedIntem);
                    parent[addjoFpopedIntem] = popitem;
                }else {
                    if(parent[popitem]!=addjoFpopedIntem){ //  if visited
                        return true;
                    }
                }

            }
        }
        return false;
    }

}

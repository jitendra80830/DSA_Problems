package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintPathBetweenTwoNode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<ArrayList<Integer>> addjList = new ArrayList<>();
        for (int i = 0; i <nodes ; i++) {
            addjList.add(new ArrayList<>());
        }
        for (int i = 0; i <edges ; i++) {
            int u =sc.nextInt();
            int v = sc.nextInt();
            addjList.get(u).add(v);
        }
        int scr = sc.nextInt();
        int dest = sc.nextInt();
        int visited[] = new int[100005];
        pathExitornot(scr , dest , visited , addjList);

    }

    private static void pathExitornot(int scr, int dest, int[] visited, ArrayList<ArrayList<Integer>> addjList) {
        Queue<Integer> q = new LinkedList<>();
        q.add(scr); // add src in queue
        visited[scr] = 1; // make visited src
        while (!q.isEmpty()){ // jab tak queue empty nhi hai tab tak
            int node = q.peek(); // peek element storing in node
            System.out.print(node+" ");
            q.remove(); // and remove 1st element

           // if(node == dest){ // if peek element is destination the return true means path exits kr raha hai
                //return true;
             // if node not destination then find addj elements of that node
                for(int addj : addjList.get(node)){
                    if(visited[addj] == 0){ // if addj element not visited then
                        q.add(addj); // add in queue
                        visited[addj] = 1; // make visited

                    }
                }

        }
    }
}

package Graph;

import QueuePack.Queue;

public class Graph {
    private Node[] nodeLIst;
    private int[][] adjMatrix;
    private int numberNodes;
    private Queue queue;

    public Graph(int size){
        int maxSize = size;
        nodeLIst = new Node[maxSize];
        adjMatrix = new int[maxSize][maxSize];
        numberNodes = 0;
        queue = new Queue(maxSize);

    }
    public void adNodes(int elements){
        nodeLIst[numberNodes++] = new Node(elements);
    }
    public void addEdges(int start , int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }
    public void printNode(int index){
        System.out.print(nodeLIst[index].data+" ");
    }
    public int getAdgUnvisitedNode(int node){
        for (int j = 0; j <numberNodes ; j++) {
            if(adjMatrix[node][j] == 1 && nodeLIst[j].visited == false){
                return j;
            }

        }
        return -1;
    }
    public void bfs() throws Exception {
        nodeLIst[0].visited = true; // first node visited
        printNode(0); // and print
        queue.enQueue(0); // add into queue
        int node1;
        while (!queue.isEmpty()){ // jab tak q is not empty
            int node2 = queue.deQueue();
            while ((node1 = getAdgUnvisitedNode(node2))!=-1){ // getting that node which not visitted of node2 neiber and storing in node1
                nodeLIst[node1].visited = true; // making visited
                printNode(node1); // and print that
                queue.enQueue(node1);// and insert in queue node1

            }
        }
    }

}

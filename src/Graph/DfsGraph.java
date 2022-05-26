package Graph;

public class DfsGraph {
    private Node[] nodesList;
    private int[][] addjMatrix;
    private int numberNodes;

    public DfsGraph(int size){
        nodesList = new Node[size];
        addjMatrix = new int[size][size];
        numberNodes = 0;
    }
    public void addNodes(int elements){
        this.nodesList[numberNodes++] = new Node(elements);
    }
    public void addEdges(int start , int end){
        addjMatrix[start][end] = 1;
        addjMatrix[end][start] = 1;

    }
    public void print(int index){
        System.out.print(nodesList[index].data+" ");
    }
    public int getAddjUnvisitedNode(int index){
        for (int j = 0; j <numberNodes ; j++) {
            if(addjMatrix[index][j] ==1 && !nodesList[j].visited){
                return j;
            }

        }
        return -1;
    }
    public void dfs(int n){ // n is index that where are u starting
        nodesList[n].visited = true;
        print(n);
        int node1;

        while ((node1 = getAddjUnvisitedNode(n))!=-1){

            dfs(node1);
        }

    }
    public void dft(){
        int count = 0;
        for (int i = 0; i <numberNodes ; i++) {
            if(!nodesList[i].visited){
                dfs(i);
                count++;
            }

        }
        System.out.println(count);
    }

}

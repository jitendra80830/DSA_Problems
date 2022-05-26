package Graph;

public class GraphClient {
    public static void main(String[] args) throws Exception {
        DfsGraph g = new DfsGraph(8);
        g.addNodes(50);
        g.addNodes(10);
        g.addNodes(200);
        g.addNodes(20);
        g.addNodes(15);
        g.addNodes(30);
        g.addNodes(5);
        g.addNodes(300);
        g.addEdges(0 ,1);
        //g.addEdges(0 ,2);
        //g.addEdges(1,4);
        g.addEdges(1 ,5);
        g.addEdges(2 ,3);
        //g.addEdges(4 ,5);
        g.addEdges(4 ,6);
        //g.addEdges(5 ,7);
        System.out.println("Visited Nodes");
        g.dfs(0);
        System.out.println();
        g.dft();
    }
}

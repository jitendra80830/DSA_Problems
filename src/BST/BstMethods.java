package BST;

public class BstMethods {
    Node root;
    BstMethods(){
        root = null;
    }
    void add(int key){
        root = addNodeRec(root , key);
    }

    private Node addNodeRec(Node node, int key) {
        if(node == null){
            node = new Node(key);
            return node;
        }
        if(key < node.data){
            node.left = addNodeRec(node.left , key);
        }else if(key > node.data){
            node.right = addNodeRec(node.right , key);
        }
        return node;

    }
    void preOrder(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    int findMinEle(Node node){
        if(node.left == null){
            return node.data;
        }
        return findMinEle(node.left);
    }
    int  findMaxEle(Node node){
        if(node.right == null){
            return node.data;
        }
        return findMaxEle(node.right);
    }
    void search(int key){
        Node node = searchKey(root , key);
        if(node!=null){
            System.out.println("Data "+key+" Found");
        }else {
            System.out.println("Data "+key+" not found");
        }
    }

    private Node searchKey(Node node, int key) {
        if(node==null || node.data == key){
            return node;
        }
        if(key < node.data){
            return searchKey(node.left ,key);
        }else {
            return searchKey(node.right , key);
        }
    }
    int UniqueBSt(int n){
        int dp[] = new int[n+1];
        if(n == 1){
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                dp[i]+=dp[j-1] * dp[i-j];
            }
        }
        return dp[n];

    }
    void delete(int key){
        root =  deleteNode(root ,key);
    }

    private Node deleteNode(Node node, int key) {
        return node;

    }

    public boolean isValidBST(Node root) {
        return isValidbst(root , Long.MIN_VALUE , Long.MAX_VALUE);

    }

    private boolean isValidbst(Node root, long minValue, long maxValue1) {
        if(root == null){
            return true;
        }
        if(root.data >=maxValue1 || root.data <= minValue ){
            return false;
        }
        return isValidbst(root.left , minValue , root.data) && isValidbst(root.right , root.data , maxValue1);
    }

}

package BST;

public class BstMain {
    public static void main(String[] args){
        BstMethods bst = new BstMethods();
        bst.add(50);
        bst.add(25);
        bst.add(15);
        bst.add(75);
        bst.add(30);
        bst.add(70);
        bst.add(85);
        bst.add(10);
        bst.add(23);
        bst.add(46);
        bst.add(84);
        bst.add(90);
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println(bst.findMinEle(bst.root));
        System.out.println(bst.findMaxEle(bst.root));
        bst.search(100);
        System.out.println(bst.UniqueBSt(3));
    }
}

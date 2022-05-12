package Tries;

public class TriemethodHashMap {
    TriNodeHashMap root;
    TriemethodHashMap(){
        root = new TriNodeHashMap();
    }
    void insert(String str){
        TriNodeHashMap node = root;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            TriNodeHashMap node1 = node.children.get(ch);

            if(node1 == null){ // if ch char is null then put that char ch
                node1 = new TriNodeHashMap();
                node.children.put(ch , node1);
            }
            node = node1; //fot traversing next node

        }
        node.endOfWord = true;
    }
    boolean search(String str){
        TriNodeHashMap node = root;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            TriNodeHashMap node1 = node.children.get(ch); //geting that char
            if(node1 == null){ // if null that char then return false
                return false;
            }
            node = node1; //for traversing next node

        }
        return node.endOfWord; // if endOfWord true then string is present
    }
}

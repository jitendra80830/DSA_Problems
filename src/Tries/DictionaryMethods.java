package Tries;

public class DictionaryMethods {
    DictionaryNode root;
   public DictionaryMethods(){
        root = new DictionaryNode();
    }
    void insert(String str , String meaning){
       DictionaryNode node = root;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            DictionaryNode node1 = node.children.get(ch);
            if(node1 == null){
                node1 = new DictionaryNode();
                node.children.put(ch ,node1);
            }
            node = node1; //for traversing next Node
        }
        node.endOfWord = true;
        node.meaning = meaning;

    }
    String search(String str){
       DictionaryNode node = root;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            DictionaryNode node1 = node.children.get(ch);
            if(node1 == null){
                return "String is not found";
            }
            node = node1; //for traversing next Node
        }
        if(node.endOfWord == true){
            return node.meaning;
        }else {
            return "String is not found";
        }
    }
}

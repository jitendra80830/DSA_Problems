package Tries;

public class TriMethod {
    TrieNode root;
    void insert(String str){
        int strIndex;
        int triIndex;
        int strLength = str.length();
        TrieNode node = root;
        for (strIndex = 0; strIndex < strLength; strIndex++) {

            triIndex = str.charAt(strIndex) - 'a'; //calculating triIndex like 'a' - 'a' = 0,'b' - 'a'=1.....
            if(node.children[triIndex] == null){
                node.children[triIndex] = new TrieNode();
            }
            node = node.children[triIndex]; //pointing previes node(go to children node)

        }
        node.endOfWord = true; //making true in last of boolean variable
    }
    void display(TrieNode root , String str , int index){
        if(root.endOfWord == true){
            System.out.println(str);
        }
        for (int i = 0; i <26 ; i++) {
            if(root.children[i]!=null){
                String key = str + (char)(i+'a'); //converting index to char
                display(root.children[i] ,key , index+1 );
            }
        }
    }
    boolean search(String str){

        int strIndex;
        int strLength = str.length();
        int triIndex;
        TrieNode node = root;
        for (strIndex = 0; strIndex < strLength; strIndex++) {
            triIndex = str.charAt(strIndex) -  'a'; //converting char to that char index
            if(node.children[triIndex]==null){
                return false;
            }
            node = node.children[triIndex];

        }
        return (node!=null && node.endOfWord == true);
    }

}

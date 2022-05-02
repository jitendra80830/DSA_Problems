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
    void delete(String str){
        int strLength = str.length();
        if(strLength > 0){
            deleteFun(root , str , 0 , strLength);
        }
    }

    private boolean deleteFun(TrieNode root, String str, int triIndex, int strLength) {
        if(root ==null){
            return false;
        }
        if(triIndex == strLength){
            root.endOfWord = false;
            if(hasNoChild(root)){
                return true;
            }else {
                return false;
            }
        }else {
            TrieNode chilNode = root.children[str.charAt(triIndex) - 'a']; // last child
            boolean childDeleted = deleteFun(chilNode ,str , triIndex+1 , strLength); //if deleted last child return true other false

            if(childDeleted){ //if deleted
                return (root.endOfWord && hasNoChild(root));
            }
        }
        return false;
    }

    private boolean hasNoChild(TrieNode root) {
        for (int i = 0; i <root.children.length ; i++) {
            if(root.children[i]!=null){ //if not null means child is present then return false
                return false;
            }

        }
        return true; //if null means there not child then return true
    }
    boolean printAutoSuggession(TrieNode root , String prifixStr){
        int level;
        int length = prifixStr.length();
        TrieNode node  = root;
        for (level = 0; level <length ; level++) {
            int triIndex = prifixStr.charAt(level) - 'a';
            if(node.children[triIndex] == null){
                return false;
            }
            node = node.children[triIndex];
        }
        if(node.endOfWord && hasNoChild(node)){ //if endofWord if true and no any child node then
            System.out.println(prifixStr);
            return false;
        }
        if(!hasNoChild(node)){
            recursiveDisplay(node , prifixStr);
            return true;
        }
        return false;
    }

    private void recursiveDisplay(TrieNode node, String prifixStr) {
        if(node.endOfWord){
            System.out.println(prifixStr);
        }
        for (int i = 0; i <26 ; i++) {
            if(node.children[i]!=null){
                String key = prifixStr + (char)(i + 'a');
                recursiveDisplay(node.children[i],key );
            }

        }

    }

}

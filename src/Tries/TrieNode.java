package Tries;

public class TrieNode {
    int size = 26;
    TrieNode []children = new TrieNode[size];
    boolean endOfWord;
    TrieNode(){
        endOfWord = false;
        for (int i = 0; i <size ; i++) {
            children[i] = null;
        }
    }
}

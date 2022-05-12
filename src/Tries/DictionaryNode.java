package Tries;

import java.util.HashMap;
import java.util.Map;

public class DictionaryNode {
    Map<Character , DictionaryNode> children;
    boolean endOfWord;
    String meaning;
    DictionaryNode(){
        children = new HashMap<>();
        endOfWord = false;

    }
}
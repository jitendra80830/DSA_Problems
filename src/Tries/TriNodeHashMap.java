package Tries;

import java.util.HashMap;
import java.util.Map;

public class TriNodeHashMap {
    Map<Character , TriNodeHashMap> children;
    boolean endOfWord;
    TriNodeHashMap(){
        children = new HashMap<>();
        endOfWord = false;
    }
}

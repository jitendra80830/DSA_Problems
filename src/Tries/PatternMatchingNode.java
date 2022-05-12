package Tries;

import java.util.LinkedList;
import java.util.List;

public class PatternMatchingNode {
    int size = 26;
    PatternMatchingNode[] children = new PatternMatchingNode[size];
    boolean endOfWords;
    List<Integer> nodeIndex; //list

    public PatternMatchingNode(){
        endOfWords = false;
        nodeIndex = new LinkedList<>();
        for (int i = 0; i <26 ; i++) {
            children[i] = null;
        }
    }
}

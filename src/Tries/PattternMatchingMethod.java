package Tries;

import Tries.PatternMatchingNode;

public class PattternMatchingMethod {
    PatternMatchingNode root = new PatternMatchingNode();

    void insert(String str){
        for (int i = 0; i <str.length() ; i++) {
            createSuffixTrie(str.substring(i) , i); //for finding all suffixes by passing i in substring and i for offset
        }
    }

    private void createSuffixTrie(String str, int offset) {
        int strIndex;
        int strLength = str.length();
        int triIndex;
        PatternMatchingNode node = root;
        for (strIndex = 0; strIndex <strLength ; strIndex++) {

            triIndex = str.charAt(strIndex) - 'a';
            if(node.children[triIndex] == null){
                node.children[triIndex] = new PatternMatchingNode();

            }
            node =  node.children[triIndex]; // traverse for next Node
            node.nodeIndex.add(strIndex + offset); //nodeIndex is a list ,adding strIndex + offset in list for caalculating that index which will match
        }
        node.endOfWords = true;

    }
    public void matchPattern(String pattern){
        int count = 0;
        //boolean flag = false;
        if(pattern == null){
            return;
        }
        PatternMatchingNode currentNode = root;
        int i =0;
        while (i < pattern.length()){
            if(currentNode == null){
                break;
            }
            currentNode = currentNode.children[pattern.charAt(i) - 'a']; // converting char to indexes
            i++;
        }
        if(i < pattern.length()){
            System.out.println("Patter not exits");
        }else {
            for (int j = 0; j <currentNode.nodeIndex.size() ; j++) {
                //flag = true;
                //System.out.println("Patter found at index "+ (currentNode.nodeIndex.get(j) - (pattern.length() - 1)));
                count++;

            }
        }
        System.out.println(count);


    }
}

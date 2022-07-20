package StackPack;

public class SackLinkedListClient {
    public static void main(String[] args){
        StackUsingLikedList st = new StackUsingLikedList();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(20);
        st.print();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size);
        System.out.println(st.pop());
        System.out.println(st.size);


    }
}

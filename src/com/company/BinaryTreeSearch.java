package com.company;

public class BinaryTreeSearch {
    class Node<T> {
        Node(T x) {
            value = x;
        }
        T value;
        Node<T> left;
        Node<T> right;
    }

    public static Integer isPresent(Node<Integer> head, Integer val){
        if(head == null)
            return 0;
        Node<Integer> trav = head;

        while(true){
            if(val == trav.value)
                return 1;
            if(val < trav.value) {
                if (trav.left == null)
                    return 0;
                trav = trav.left;
                continue;
            }
            if(val > trav.value) {
                if (trav.right == null)
                    return 0;
                trav = trav.right;
                continue;
            }
            return 0;
        }
    }
}

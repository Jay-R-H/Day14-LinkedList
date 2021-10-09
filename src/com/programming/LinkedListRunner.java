package com.programming;

public class LinkedListRunner {


    public static void main(String[] args) {

        LinkedListOperation linked_list = new LinkedListOperation();

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        //Adding nodes.
        linked_list.addNode(myFirstNode);
        linked_list.addNode(mySecondNode);
        linked_list.addNode(myThirdNode);
        //Displaying the nodes.
        linked_list.displayNode();

    }

}



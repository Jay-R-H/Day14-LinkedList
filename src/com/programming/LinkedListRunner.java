package com.programming;

public class LinkedListRunner {
    public static void main(String[] args) {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        // Linking nodes.
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        // Checking if nodes are linked successfully.
        if (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode))
            System.out.println("Linked successfully");
        else
            System.out.println("Linking unsuccessful");

    }

}


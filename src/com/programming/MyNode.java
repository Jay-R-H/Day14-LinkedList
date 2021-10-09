package com.programming;

public class MyNode<K> {
    private final K key;
    private MyNode next;

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result =myFirstNode.getNext().equals(mySecondNode)&&mySecondNode.getNext().equals(myThirdNode);
        if (result){
            System.out.println("True");
        }
    }
}

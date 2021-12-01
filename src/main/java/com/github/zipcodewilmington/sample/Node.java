package com.github.zipcodewilmington.sample;

public class Node<E,T> {

    public String k;
    public Integer v;
    private Node next;

    public Node(String k, Integer v){
        this.k = k;
        this.v = v;

    }

    public void setNextNode(Node node){
        this.next = node;
    }

    public Node getNext() {
        return next;
    }

}

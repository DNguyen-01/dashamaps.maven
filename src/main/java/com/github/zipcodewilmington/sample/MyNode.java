package com.github.zipcodewilmington.sample;

import org.w3c.dom.Node;

    public class MyNode<E,T> {

    public String k;
    public Integer v;
    private MyNode next;

    public MyNode(String k, Integer v){
        this.k = k;
        this.v = v;

    }

    public void setK(String k) {
        this.k = k;
    }

    public void setV(String v) {
        this.v = v;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public String getK() {
        return k;
    }

    public Integer getV() {
        return v;
    }


    public MyNode getNext() {
        return next;
    }

}

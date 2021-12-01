package com.github.zipcodewilmington;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOne<E,T> implements HashMapX {

    Node[] nodeArray;

    public DashaMapOne (){

      nodeArray = new Node[26];

    }

    //TODO
    //utilize the method from the interface against the array of 26 letters

    private String HashFunctionOne(String input) {
//        if (input.length() > 0) {
//
//            return String.toLowerCase(String.valueOf(input.charAt(0)));
//        }
        return null;
    }




    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}

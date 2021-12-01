package com.github.zipcodewilmington;

import com.github.zipcodewilmington.sample.MyNode;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOne<E,T> implements HashMapX {

    MyNode[] nodeArray;

    public DashaMapOne (){

      nodeArray = new MyNode[26];


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

   //.set is equivalent to a .add function of an arraylist


    @Override
    public void set(String key, Integer value) {
        MyNode newNode = new MyNode(key, value);
        int emptyNode = 0;
        for (int i = 0; i < nodeArray.length; i++) {
            if (nodeArray[i].getNext() == null){
                emptyNode = i;
                break;
            }//find
        }

        nodeArray[emptyNode].setNext(newNode);

        nodeArray[emptyNode+1] = newNode;

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

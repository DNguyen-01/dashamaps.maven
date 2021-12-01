package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.HashMapX;

public class DashaMapTwo<E,T> implements HashMapX {


    private String HashFunctionTwo(String input) {
//        if (input.length() > 0) {
//            return String.toLowerCase(String.valueOf(input.charAt(1)));
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

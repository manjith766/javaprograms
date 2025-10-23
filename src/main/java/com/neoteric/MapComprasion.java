package com.neoteric;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class MapComprasion {
    public static void main(String[] args) {
        HashMap<String,Integer>hashMap = new HashMap<>();
        hashMap.put(null,1);
        Hashtable<String,Integer>hashtable = new Hashtable<>();
        hashtable.put("two",2);
        hashtable.put( "",3);
        System.out.println(hashMap);
        System.out.println(hashtable);
        ConcurrentHashMap<String,Integer>concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("three",3);
        System.out.println(concurrentHashMap);


    }
}

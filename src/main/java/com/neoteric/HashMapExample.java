package com.neoteric;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ram",1);
        map.put("shyam",2);
        map.put("hari",3);
        System.out.println(map);
        System.out.println(map.get("ram"));

    }
}
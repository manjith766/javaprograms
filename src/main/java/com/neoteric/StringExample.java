package com.neoteric;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        str += " World";
        System.out.println(str);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);
    }
}

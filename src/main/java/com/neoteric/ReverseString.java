package com.neoteric;

public class ReverseString {
    public static String reverse(String str){
        String result ="";
        for(int i =str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}

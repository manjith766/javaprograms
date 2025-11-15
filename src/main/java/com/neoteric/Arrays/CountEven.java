package com.neoteric.Arrays;

public class CountEven {
    public static void main(String[] args) {
        int[] nums ={3,6,9,10,12};
        int count = 0;
        for(int n:nums){
           if (n%2 !=0){//oddok
            // if (n%2 == 0){//even
                count ++;
            }
        }
        System.out.println("even numbers "+count);
    }
}

package com.neoteric.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 9};
        int target = 9;
        boolean found = false;
        for (int n : nums){
            if (n == target){
                break;

            }
        }
        if(found){
            System.out.println(target +"target is found");

        }else
        System.out.println(target+"target is  not found");

    }
}

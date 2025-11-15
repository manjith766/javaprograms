package com.neoteric.topcodingquestions;

public class ReverseAnInteger {
   public static int reverse(int n){
       int rev = 0;
       while (n != 0){
           int digit = n % 10;
           rev = rev*10+digit;
           n = n/10;

       }
       return  rev;
   }

    public static void main(String[] args) {
        int number = 1234;
        int result = reverse(number);
        System.out.println("reverse number "+result);
    }
}


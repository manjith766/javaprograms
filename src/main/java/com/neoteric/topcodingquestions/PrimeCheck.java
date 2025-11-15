package com.neoteric.topcodingquestions;

public class PrimeCheck {
    public static boolean isPrime(int n){
        if(n<2)return false;
        if (n == 2)return true;
        if(n % 2 == 0) return false;

        for (int i =3 ;i * i<=n; i +=2){
            if (n % i == 0){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        int number = 18;
        if (isPrime(number)) {

            System.out.println("prime"+number);
        }else {
            System.out.println("not prime"+number);
        }
    }
}

package com.neoteric;

public class ImmutableClass {
    private final int value;

    public ImmutableClass(int value) {
        this.value = value;
    }
     public int getValue(){
        return value;
     }

    public static void main(String[] args) {
        ImmutableClass obj1 = new ImmutableClass(42);
        System.out.println("Value: " + obj1.getValue());
        // obj1.value = 100; // This line would cause a compilation error
        ImmutableClass obj2 = new ImmutableClass(100);
        System.out.println("Value: " + obj2.getValue());
    }
}

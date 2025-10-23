package com.neoteric;
// Demonstrate method overloading and overriding and innerer classes and outer classes
//Here’s how you can refactor the code to demonstrate inner and outer classes. The Animal and Dog classes will be inner classes inside the outer class PolymorphismExample.
public class Innerclass {// outer class

        static class Animal {
            void sound() { System.out.println("Animal sound"); }
        }
        static class Dog extends Animal {
            void sound() { System.out.println("Dog barks"); } // Override
            void sound(String type) { System.out.println("Dog " + type); } // Overload
        }
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.sound(); // Dog barks
            dog.sound("growls"); // Dog growls
        }
    }




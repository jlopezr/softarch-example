package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("world!");
        myFunction(100);
    }
    public static void myFunction(int x) {
        int y = x + 10;
        System.out.println("The result is "+y);
    }
}
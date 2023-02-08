package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Planet planet = new Planet("Mars", 20);
        String name = planet.getName();
        int size = planet.getSize();
        System.out.println(name);
        System.out.println(size);
//        System.out.println(output);
    }
}
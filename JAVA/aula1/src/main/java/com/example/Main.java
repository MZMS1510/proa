package com.example;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("blue", "esferográfica", 0.6f, 90, false);
        Caneta caneta2 = new Caneta("red", "esferográfica", 0.6f, 90, false);

        caneta1.rabiscar();

        System.out.println("-------------------");

        caneta2.estado();
    }
}
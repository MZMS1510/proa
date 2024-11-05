package com.teste;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Carro carro = new Carro(4, 4, "Fusca", "Azul");
        int i = 0;
        while (i < 201) {
            i++;
            carro.acelerar();
        }
    }
}
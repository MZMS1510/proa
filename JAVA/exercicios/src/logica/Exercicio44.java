package logica;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media;
        int i = 0, soma = 0;

        while (i < 5) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            soma += scanner.nextInt();
            i++;
        }

        scanner.close();

        media = soma / 5;
        System.out.println("A média das idades é: " + media);
    }
}

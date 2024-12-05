package logica;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media;
        int i = 0, soma = 0;

        do {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            soma += scanner.nextInt();
            i++;
        } while (i < 5);

        scanner.close();

        media = soma / 5;
        System.out.println("A média das idades é: " + media);
    }
}

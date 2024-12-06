package logica;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            soma += numero;
            i++;
        } while (i < 5);

        scanner.close();

        float media = soma / 5;

        System.out.println("A média dos números é: " + media);
    }
}

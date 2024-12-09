package logica;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int soma = 0;

        scanner.close();

        int i = 0;

        do {
            if (i % 2 == 0) {
                soma += i;
            }

            i++;
        } while (i < num);

        System.out.println("A soma dos números pares de 0 até " + num + " é " + soma);
    }
}

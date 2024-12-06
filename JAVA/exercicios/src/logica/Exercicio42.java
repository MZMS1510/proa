package logica;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        int i = 1, num = 0, divisores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        scanner.close();

        while (i <= num && divisores <= 2) {
            if (num % i == 0) {
                divisores++;
            }

            i++;
        }

        if (divisores == 2) {
            System.out.println("O número " + num + " é primo");
        } else {
            System.out.println("O número " + num + " não é primo");
        }
    }
}

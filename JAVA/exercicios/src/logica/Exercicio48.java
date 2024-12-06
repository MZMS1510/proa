package logica;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println("Unidade: " + num % 10);
        System.out.println("Dezena: " + (num / 10) % 10);
        System.out.println("Centena: " + (num / 100) % 10);
        System.out.println("Milhar: " + (num / 1000) % 10);
    }
}

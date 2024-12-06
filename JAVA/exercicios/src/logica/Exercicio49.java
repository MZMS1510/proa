package logica;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int fatorial = 1;

        scanner.close();

        while (num > 0) {
            fatorial *= num;
            num--;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}

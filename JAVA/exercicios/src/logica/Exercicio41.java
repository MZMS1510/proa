package logica;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        int i = 1, num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        scanner.close();

        while (i < num) {
            if (num % i == 0) {
                System.out.println(i);
            }

            i++;
        }
    }
}

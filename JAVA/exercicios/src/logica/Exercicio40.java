package logica;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i = 1;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        scanner.close();

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }
    }
}

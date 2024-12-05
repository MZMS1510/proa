package logica;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, a, b, c;
        a = 0;
        b = 1;
        c = 0;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        scanner.close();

        do {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        } while (num > a);
    }
}

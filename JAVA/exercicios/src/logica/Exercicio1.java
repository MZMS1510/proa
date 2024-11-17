package logica;

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n1, n2;

    System.out.print("Digite o primeiro número: ");
    n1 = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    n2 = scanner.nextInt();

    scanner.close();

    System.out.println("Soma: " + (n1 + n2));
    System.out.println("Subtração: " + (n1 - n2));
    System.out.println("Multiplicação: " + (n1 * n2));
    System.out.println("Divisão: " + (n1 / n2));
  }
}

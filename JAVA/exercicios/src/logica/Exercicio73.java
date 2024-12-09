package logica;

import java.util.Scanner;

public class Exercicio73 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int num = scanner.nextInt();

    int a = 0, b = 1;
    System.out.print("Sequência de Fibonacci: " + a + " " + b);

    for (int i = 2; i < num; i++) {
      int next = a + b;
      System.out.print(" " + next);
      a = b;
      b = next;
    }
    scanner.close();
  }
}

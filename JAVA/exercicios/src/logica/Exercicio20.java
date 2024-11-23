package logica;

import java.util.Scanner;

public class Exercicio20 {
  public static void main(String[] args) {
    int num;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    num = scanner.nextInt();

    scanner.close();

    if (num % 2 == 0) {
      System.out.println("Número é par");
    } else {
      System.out.println("Número é ímpar");
    }
  }
}

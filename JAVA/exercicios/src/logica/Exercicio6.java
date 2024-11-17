package logica;

import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    int num;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    num = scanner.nextInt();

    scanner.close();

    if (num % 2 == 0) {
      System.out.println("O número " + num + " é par.");
    } else {
      System.out.println("O número " + num + " é ímpar.");
    }
  }
}

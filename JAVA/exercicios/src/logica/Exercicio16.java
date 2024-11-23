package logica;

import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    n = scanner.nextInt();

    scanner.close();

    if (n < 0) {
      System.out.println("Número negativo");
    } else if (n > 0) {
      System.out.println("Número positivo");
    } else {
      System.out.println("Número é zero");
    }
  }
}

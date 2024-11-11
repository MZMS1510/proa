package segundaaula;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número inteiro:");
    n = scanner.nextInt();

    scanner.close();

    if (n % 2 == 0) {
      System.out.println(n + " é par.");
    } else {
      System.out.println(n + " é ímpar.");
    }
  }
}

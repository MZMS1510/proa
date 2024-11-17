package logica;

import java.util.Scanner;

public class Exercicio13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro numero: ");
    int n1 = scanner.nextInt();

    System.out.print("Digite o segundo numero: ");
    int n2 = scanner.nextInt();

    scanner.close();

    if (n1 % n2 == 0) {
      System.out.println(n1 + " é múltiplo de " + n2);
    } else {
      System.out.println(n1 + " não é múltiplo de " + n2);
    }
  }
}

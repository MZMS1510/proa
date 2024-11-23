package logica;

import java.util.Scanner;

public class Exercicio18 {
  public static void main(String[] args) {
    int n1, n2;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número inteiro: ");
    n1 = scanner.nextInt();

    System.out.print("Digite o segundo número inteiro: ");
    n2 = scanner.nextInt();

    scanner.close();

    if (n1 > n2) {
      System.out.println(n1);
    } else if (n1 < n2) {
      System.out.println(n2);
    } else {
      System.out.println("Os números são iguais");
    }
  }
}

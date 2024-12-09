package logica;

import java.util.Scanner;

public class Exercicio69 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int soma = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Entre com o número " + (i + 1) + ": ");
      int num = scanner.nextInt();
      soma += num;
    }

    scanner.close();

    double media = soma / 5.0;
    System.out.println("A média é: " + media);
  }
}

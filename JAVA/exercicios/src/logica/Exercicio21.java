package logica;

import java.util.Scanner;

public class Exercicio21 {
  public static void main(String[] args) {
    int idades[] = new int[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < idades.length; i++) {
      System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
      idades[i] = scanner.nextInt();
    }

    scanner.close();

    int maiores = 0, menores = 0;

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] >= 18) {
        System.out.println("Pessoa " + (i + 1) + " é maior de idade");
        maiores++;
      } else {
        System.out.println("Pessoa " + (i + 1) + " é menor de idade");
        menores++;
      }
    }

    System.out.println("Total de pessoas maiores de idade: " + maiores);
    System.out.println("Total de pessoas menores de idade: " + menores);
  }
}

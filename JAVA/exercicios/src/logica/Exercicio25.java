package logica;

import java.util.Scanner;

public class Exercicio25 {
  public static void main(String[] args) {
    int faltas;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de faltas: ");
    faltas = scanner.nextInt();

    scanner.close();

    if (faltas > 15) {
      System.out.println("Reprovado por faltas");
    } else {
      System.out.println("Aprovado");
    }
  }
}

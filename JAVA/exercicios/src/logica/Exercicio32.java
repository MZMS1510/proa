package logica;

import java.util.Scanner;

public class Exercicio32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota do aluno: ");
    double nota = scanner.nextDouble();

    if (nota >= 90) {
      System.out.println("Conceito: A");
    } else if (nota >= 80) {
      System.out.println("Conceito: B");
    } else if (nota >= 70) {
      System.out.println("Conceito: C");
    } else if (nota >= 60) {
      System.out.println("Conceito: D");
    } else {
      System.out.println("Conceito: F");
    }

    scanner.close();
  }
}

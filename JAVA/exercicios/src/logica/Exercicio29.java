package logica;

import java.util.Scanner;

public class Exercicio29 {
  public static void main(String[] args) {
    int nota;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota do aluno: ");
    nota = scanner.nextInt();

    scanner.close();

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }
}

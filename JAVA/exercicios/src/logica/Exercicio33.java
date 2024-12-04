package logica;

import java.util.Scanner;

public class Exercicio33 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o período que o aluno estuda (M/V): ");
    char periodo = scanner.next().charAt(0);

    scanner.close();

    if (periodo == 'M') {
      System.out.println("Bom dia, " + nome);
    } else if (periodo == 'V') {
      System.out.println("Boa tarde, " + nome);
    } else {
      System.out.println("Período inválido");
    }
  }
}

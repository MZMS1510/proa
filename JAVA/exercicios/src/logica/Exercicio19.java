package logica;

import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    int nota1, nota2, nota3;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    nota1 = scanner.nextInt();

    System.out.print("Digite a segunda nota: ");
    nota2 = scanner.nextInt();

    System.out.print("Digite a terceira nota: ");
    nota3 = scanner.nextInt();

    scanner.close();

    float media = (nota1 + nota2 + nota3) / 3;

    if (media < 7) {
      System.out.println("Reprovado");
    } else {
      System.out.println("Aprovado");
    }
  }
}

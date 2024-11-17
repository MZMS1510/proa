package logica;

import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota 1: ");
    float nota1 = scanner.nextFloat();

    System.out.print("Digite a nota 2: ");
    float nota2 = scanner.nextFloat();

    System.out.print("Digite a nota 3: ");
    float nota3 = scanner.nextFloat();

    scanner.close();

    float media = (nota1 + nota2 + nota3) / 3;
    System.out.println("Média: " + media);
  }
}

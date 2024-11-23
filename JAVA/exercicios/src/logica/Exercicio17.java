package logica;

import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {
    int idade;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    idade = scanner.nextInt();

    scanner.close();

    if (idade < 13) {
      System.out.println("Criança");
    } else if (idade < 18) {
      System.out.println("Adolescente");
    } else if (idade < 60) {
      System.out.println("Adulto");
    } else {
      System.out.println("Idoso");
    }
  }
}

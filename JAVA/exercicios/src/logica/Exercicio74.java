package logica;

import java.util.Scanner;

public class Exercicio74 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalAge = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
      scanner.nextLine();

      System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
      int age = scanner.nextInt();

      totalAge += age;
    }

    scanner.close();

    double averageAge = totalAge / 5.0;
    System.out.println("A média das idades é: " + averageAge);
  }
}

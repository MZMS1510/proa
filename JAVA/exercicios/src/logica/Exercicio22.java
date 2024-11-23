package logica;

import java.util.Scanner;

public class Exercicio22 {
  public static void main(String[] args) {
    int salario;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o salário: ");
    salario = scanner.nextInt();

    scanner.close();

    if (salario > 2000) {
      System.out.println("Bonus de 10%");
    } else {
      System.out.println("Bonus de 5%");
    }
  }
}

package logica;

import java.util.Scanner;

public class Exercicio15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu saário: ");
    float salario = scanner.nextFloat();

    scanner.close();

    float novoSalario = salario + (salario * 0.15f);

    System.out.println("Novo salário: " + novoSalario);
  }
}

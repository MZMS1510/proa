package logica;

import java.util.Scanner;

public class Exercicio7 {
  public static void main(String[] args) {
    float salarioBase;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o salário base do funcionário: ");
    salarioBase = scanner.nextFloat();

    scanner.close();

    System.out.println("Salário líquido: " + (salarioBase + (salarioBase * 0.05)));
  }
}

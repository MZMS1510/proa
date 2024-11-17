package logica;

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    float base, altura;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a base do triângulo: ");
    base = scanner.nextFloat();

    System.out.print("Digite a altura do triângulo: ");
    altura = scanner.nextFloat();

    scanner.close();

    System.out.println("Área: " + (base * altura) / 2);
  }
}

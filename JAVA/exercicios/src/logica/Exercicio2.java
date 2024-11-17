package logica;

import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    float raio;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o raio do círculo: ");
    raio = scanner.nextFloat();

    scanner.close();

    System.out.println("Área: " + (3.14 * (raio * raio)));
    System.out.println("Perímetro: " + (2 * 3.14 * raio));
  }
}

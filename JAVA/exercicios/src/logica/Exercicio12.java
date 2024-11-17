package logica;

import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o peso em quilos: ");
    float peso = scanner.nextFloat();

    System.out.print("Digite a altura em metros: ");
    float altura = scanner.nextFloat();

    scanner.close();

    float imc = peso / (altura * altura);

    System.out.println("IMC: " + imc);
  }
}

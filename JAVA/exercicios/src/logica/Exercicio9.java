package logica;

import java.util.Scanner;

public class Exercicio9 {
  public static void main(String[] args) {
    float depositoMensal, taxaJuros;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do depósito mensal: ");
    depositoMensal = scanner.nextFloat();

    System.out.print("Digite a taxa de juros: ");
    taxaJuros = scanner.nextFloat();

    scanner.close();

    System.out.println("Montante após 12 meses: " + (depositoMensal * 12 + (depositoMensal * 12 * taxaJuros)));
  }
}

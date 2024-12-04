package logica;

import java.util.Scanner;

public class Exercicio30 {
  public static void main(String[] args) {
    int quant;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de maçãs: ");
    quant = scanner.nextInt();

    scanner.close();

    if (quant < 12) {
      System.out.println("Cada maçã custa R$ 0,50");
      System.out.println("O total a pagar é R$ " + (quant * 0.50));
    } else {
      System.out.println("Cada maçã custa R$ 0,40");
      System.out.println("O total a pagar é R$ " + (quant * 0.40));
    }
  }
}

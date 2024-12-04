package logica;

import java.util.Scanner;

public class Exercicio26 {
  public static void main(String[] args) {
    int codigo, quantidade;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Produto 1: R$10,00");
    System.out.println("Produto 2: R$15,00");
    System.out.println("Produto 3: R$20,00");
    System.out.println("Produto 4: R$30,00");

    System.out.print("Digite o código do produto: ");
    codigo = scanner.nextInt();

    System.out.print("Digite a quantidade: ");
    quantidade = scanner.nextInt();

    scanner.close();

    switch (codigo) {
      case 1:
        System.out.println("Total: R$" + (10 * quantidade));
        break;
      case 2:
        System.out.println("Total: R$" + (15 * quantidade));
        break;
      case 3:
        System.out.println("Total: R$" + (20 * quantidade));
        break;
      case 4:
        System.out.println("Total: R$" + (30 * quantidade));
        break;
      default:
        System.out.println("Código inválido");
        break;
    }
  }
}

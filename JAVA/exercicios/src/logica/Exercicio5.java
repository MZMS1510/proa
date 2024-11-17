package logica;

import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    float preco;
    int quantidade;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o preço do produto: ");
    preco = scanner.nextFloat();

    System.out.print("Digite a quantidade comprada: ");
    quantidade = scanner.nextInt();

    scanner.close();

    if (quantidade > 10) {
      System.out.println("Total a pagar: " + (preco * quantidade * 0.9));
    } else {
      System.out.println("Total a pagar: " + (preco * quantidade));
    }
  }
}

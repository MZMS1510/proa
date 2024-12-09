package logica;

import java.util.Scanner;

public class Exercicio76 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();
    int soma = 0;

    for (int i = 1; i <= numero; i++) {
      if (i % 2 == 0) {
        soma += i;
      }
    }

    System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);
    scanner.close();
  }
}

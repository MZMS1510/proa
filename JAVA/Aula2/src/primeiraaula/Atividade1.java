package primeiraaula;

import java.util.Scanner;

public class Atividade1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero1, numero2;

    System.out.print("Digite o primeiro número: ");
    numero1 = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    numero2 = scanner.nextInt();

    scanner.close();

    int soma = numero1 + numero2;

    System.out.println("O valor do primeiro número é: " + numero1);
    System.out.println("O valor do segundo número é: " + numero2);
    System.out.println("A soma dos dois números é: " + soma);
  }
}

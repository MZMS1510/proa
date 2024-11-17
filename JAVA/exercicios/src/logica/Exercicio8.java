package logica;

import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n1, n2, aux;

    System.out.print("Digite o primeiro número: ");
    n1 = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    n2 = scanner.nextInt();

    scanner.close();

    System.out.println("Antes da troca: " + n1 + " e " + n2);

    aux = n1;
    n1 = n2;
    n2 = aux;

    System.out.println("Depois da troca: " + n1 + " e " + n2);
  }
}

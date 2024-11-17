package logica;

import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    int nota1, nota2, nota3;
    int peso1 = 2, peso2 = 3, peso3 = 5;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    nota1 = scanner.nextInt();

    System.out.print("Digite a segunda nota: ");
    nota2 = scanner.nextInt();

    System.out.print("Digite a terceira nota: ");
    nota3 = scanner.nextInt();

    double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (double) (peso1 + peso2 + peso3);
    System.out.println("A média ponderada é: " + mediaPonderada);

    scanner.close();
  }
}

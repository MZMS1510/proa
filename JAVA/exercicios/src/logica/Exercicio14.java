package logica;

import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite quantos anos meses e dias de vida você tem:");
    int anos = scanner.nextInt();
    int meses = scanner.nextInt();
    int dias = scanner.nextInt();

    scanner.close();

    int diasDeVida = anos * 365 + meses * 30 + dias;

    System.out.println("Você tem " + diasDeVida + " dias de vida.");
  }
}

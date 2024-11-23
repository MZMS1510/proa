package logica;

import java.util.Scanner;

public class Exercicio23 {
  public static void main(String[] args) {
    String mes;
    int dias;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o mês: ");
    mes = scanner.nextLine();

    scanner.close();

    switch (mes.toLowerCase()) {
      case "janeiro":
      case "março":
      case "maio":
      case "julho":
      case "agosto":
      case "outubro":
      case "dezembro":
        dias = 31;
        break;
      case "abril":
      case "junho":
      case "setembro":
      case "novembro":
        dias = 30;
        break;
      case "fevereiro":
        dias = 28;
        break;
      default:
        dias = 0;
        break;
    }

    if (dias == 0) {
      System.out.println("Mês inválido");
    } else {
      System.out.println("O mês de " + mes + " tem " + dias + " dias");
    }
  }
}

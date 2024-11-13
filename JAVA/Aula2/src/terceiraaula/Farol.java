package terceiraaula;

import java.util.Scanner;

public class Farol {
  public static void main(String[] args) {
    int farol = 0;
    String mensagem = "";

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número do farol: ");
    farol = scanner.nextInt();

    scanner.close();

    switch (farol) {
    case 1:
      mensagem = "Farol verde! Siga";
      break;

    case 2:
      mensagem = "Farol amarelo! Atenção";
      break;

    case 3:
      mensagem = "Farol vermelho! Pare";
    default:
      mensagem = "Farol inválido";
      break;
    }

    System.out.println(mensagem);
  }
}

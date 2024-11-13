package segundaaula;

import java.util.Scanner;

public class Combo {
  public static void main(String[] args) {
    int combo = 0;
    String mensagem = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("1 - Combo 1: 1 Cheeseburguer de Cheddar + 1 refrigerante + 1 batata frita");
    System.out.println("2 - Combo 2: 1 BK Original + 1 refrigerante + 1 batata frita");
    System.out.println("3 - Combo 3: 1 Cheeseburguer duplo + 1 refrigerante + 1 batata frita");
    System.out
        .println("4 - Combo 4: 1 BK Original + 1 refrigerante + 10 BK Chicken + 1 sobremesa + 1 refil de refrigerante");
    System.out.println("5 - Combo 5: 1 BK Chicken Crispy + 1 refrigerante + 1 batata frita + 1 sobremesa");

    System.out.print("Digite o número do combo: ");
    combo = scanner.nextInt();

    scanner.close();

    switch (combo) {
    case 1:
      mensagem = "Combo 1: 1 Cheeseburguer de Cheddar + 1 refrigerante + 1 batata frita";
      break;

    case 2:
      mensagem = "Combo 2: 1 BK Original + 1 refrigerante + 1 batata frita";
      break;

    case 3:
      mensagem = "Combo 3: 1 Cheeseburguer duplo + 1 refrigerante + 1 batata frita";
      break;

    case 4:
      mensagem = "Combo 4: 1 BK Original + 1 refrigerante + 10 BK Chicken + 1 sobremesa + 1 refil de refrigerante";
      break;

    case 5:
      mensagem = "Combo 5: 1 BK Chicken Crispy + 1 refrigerante + 1 batata frita + 1 sobremesa";
      break;

    default:
      mensagem = "Combo inválido";
      break;
    }

    System.out.println(mensagem);
  }
}

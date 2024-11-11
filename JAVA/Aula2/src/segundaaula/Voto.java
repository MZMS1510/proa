package segundaaula;

import java.util.Scanner;

public class Voto {
  public static void main(String[] args) {
    int idade;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a sua idade: ");
    idade = scanner.nextInt();

    scanner.close();

    if (idade >= 18 && idade <= 70) {
      System.out.println("Você é obrigado a votar.");
    } else {
      System.out.println("Você não é obrigado a votar.");
    }
  }
}

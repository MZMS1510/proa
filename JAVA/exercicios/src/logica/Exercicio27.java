package logica;

import java.util.Scanner;

public class Exercicio27 {
  public static void main(String[] args) {
    int idade;
    char sexo;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a idade: ");
    idade = scanner.nextInt();

    System.out.print("Digite o sexo (M/F): ");
    sexo = scanner.next().charAt(0);

    scanner.close();

    if (sexo == 'M') {
      if (idade >= 65) {
        System.out.println("Pode se aposentar");
      } else {
        System.out.println("Não pode se aposentar");
      }
    } else if (sexo == 'F') {
      if (idade >= 60) {
        System.out.println("Pode se aposentar");
      } else {
        System.out.println("Não pode se aposentar");
      }
    } else {
      System.out.println("Sexo inválido");
    }
  }
}

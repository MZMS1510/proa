package logica;

import java.util.Scanner;

public class Exercicio65 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome;
    int idade, somaIdades = 0, contador = 0;

    do {
      System.out.print("Digite o nome: ");
      nome = scanner.nextLine();
      if (!nome.equalsIgnoreCase("fim")) {
        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        somaIdades += idade;
        contador++;
      }
    } while (!nome.equalsIgnoreCase("fim"));

    if (contador > 0) {
      double mediaIdades = (double) somaIdades / contador;
      System.out.println("Média das idades: " + mediaIdades);
    } else {
      System.out.println("Nenhuma idade foi informada.");
    }

    scanner.close();
  }
}

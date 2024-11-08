package primeiraaula;

import java.util.Scanner;

public class Atividade2 {
  public static void main(String[] args) {
    float nota1, nota2, nota3, nota4, media;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    nota1 = scanner.nextFloat();

    System.out.print("Digite a segunda nota: ");
    nota2 = scanner.nextFloat();

    System.out.print("Digite a terceira nota: ");
    nota3 = scanner.nextFloat();

    System.out.print("Digite a quarta nota: ");
    nota4 = scanner.nextFloat();

    scanner.close();

    media = (nota1 + nota2 + nota3 + nota4) / 4;
    System.out.println("A média das notas é: " + media);
  }
}

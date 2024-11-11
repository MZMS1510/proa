package segundaaula;

import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
    float nota1, nota2, nota3, media;
    Scanner scaner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    nota1 = scaner.nextFloat();

    System.out.print("Digite a segunda nota: ");
    nota2 = scaner.nextFloat();

    System.out.print("Digite a terceira nota: ");
    nota3 = scaner.nextFloat();

    scaner.close();

    media = (nota1 + nota2 + nota3) / 3;

    if (media >= 7) {
      System.out.println("Aprovado.");
    } else if (media >= 5) {
      System.out.println("Recuperação.");
    } else {
      System.out.println("Reprovado.");
    }
  }
}

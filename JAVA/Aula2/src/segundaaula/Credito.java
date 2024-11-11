package segundaaula;

import java.util.Scanner;

public class Credito {
  public static void main(String[] args) {
    float s1, s2, s3, s4, s5, s6, media; // Salarios do semestre e sua media
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite os salarios do Semestre:");
    s1 = scanner.nextFloat();
    s2 = scanner.nextFloat();
    s3 = scanner.nextFloat();
    s4 = scanner.nextFloat();
    s5 = scanner.nextFloat();
    s6 = scanner.nextFloat();

    scanner.close();

    media = (s1 + s2 + s3 + s4 + s5 + s6) / 6;

    if (media <= 500) {
      System.out.println("Nenhum crédito");
    } else if (media <= 1000) {
      System.out.println("Crédito de 30%");
    } else if (media <= 3000) {
      System.out.println("Crédito de 40%");
    } else {
      System.out.println("Crédito de 50%");
    }
  }
}

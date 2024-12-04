package logica;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
    int n1, n2, n3;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite três números inteiros: ");
    n1 = scanner.nextInt();
    n2 = scanner.nextInt();
    n3 = scanner.nextInt();

    scanner.close();

    if (n1 > n2 && n1 > n3) {
      if (n2 > n3) {
        System.out.println("1: " + n1 + "\n2: " + n2 + "\n3: " + n3);
      } else {
        System.out.println("1: " + n1 + "\n2: " + n3 + "\n3: " + n2);
      }
    } else if (n2 > n1 && n2 > n3) {
      if (n1 > n3) {
        System.out.println("1: " + n2 + "\n2: " + n1 + "\n3: " + n3);
      } else {
        System.out.println("1: " + n2 + "\n2: " + n3 + "\n3: " + n1);
      }
    } else {
      if (n1 > n2) {
        System.out.println("1: " + n3 + "\n2: " + n1 + "\n3: " + n2);
      } else {
        System.out.println("1: " + n3 + "\n2: " + n2 + "\n3: " + n1);
      }
    }
  }
}

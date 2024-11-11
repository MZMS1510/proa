package segundaaula;

import java.util.Scanner;

public class Maior {
  public static void main(String[] args) {
    int n1, n2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite dois números inteiros:");
    n1 = scanner.nextInt();
    n2 = scanner.nextInt();

    scanner.close();

    if (n1 > n2) {
      System.out.println(n1 + " é maior que " + n2);
    } else if (n1 < n2) {
      System.out.println(n2 + " é maior que " + n1);
    } else {
      System.out.println(n1 + " é igual a " + n2);
    }
  }
}

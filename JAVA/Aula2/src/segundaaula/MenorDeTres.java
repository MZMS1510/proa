package segundaaula;

import java.util.Scanner;

public class MenorDeTres {
  public static void main(String[] args) {
    int n1, n2, n3;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite três números inteiros:");
    n1 = scanner.nextInt();
    n2 = scanner.nextInt();
    n3 = scanner.nextInt();

    scanner.close();

    if (n1 < n2 && n1 < n3) {
      System.out.println(n1 + " é o menor número.");
    } else if (n2 < n1 && n2 < n3) {
      System.out.println(n2 + " é o menor número.");
    } else {
      System.out.println(n3 + " é o menor número.");
    }
  }
}

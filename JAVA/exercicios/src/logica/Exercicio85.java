package logica;

import java.util.Scanner;

public class Exercicio85 {
  public static void main(String[] args) {
    int[] num = new int[5];

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < num.length; i++) {
      System.out.print("Digite um número: ");
      num[i] = scanner.nextInt();
    }

    scanner.close();

    int minNum = num[0], maxNum = num[0];

    for (int i = 0; i < num.length; i++) {
      if (num[i] > maxNum)
        maxNum = num[i];
      else if (num[i] < minNum)
        minNum = num[i];
    }
  }
}

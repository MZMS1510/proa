package logica;

import java.util.Scanner;

public class Exercicio87 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    int positivos = 0;

    for (int i : nums) {
      if (i > 0)
        positivos++;
    }

    System.out.println(positivos);
  }
}

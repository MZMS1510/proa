package logica;

import java.util.Scanner;

public class exercicio84 {
  public static void main(String[] args) {
    int[] nums = new int[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    int pares = 0;
    for (int i : nums) {
      if (i % 2 == 0) {
        pares++;
      }
    }

    System.out.println(pares);
  }
}

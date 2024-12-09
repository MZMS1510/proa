package logica;

import java.util.Scanner;

public class Exercicio90 {
  public static void main(String[] args) {
    int[] nums = new int[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    for (int i : nums) {
      if (i == 0) {
        System.out.println("Tem zero");
        break;
      }
    }

  }
}

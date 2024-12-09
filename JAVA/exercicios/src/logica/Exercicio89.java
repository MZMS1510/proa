package logica;

import java.util.Scanner;

public class Exercicio89 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    int negativos = 0, positivos = 0;

    for (int i : nums) {
      if (i < 0) {
        negativos++;
      } else if (i > 0) {
        positivos++;
      }
    }

    System.out.println("Negativos: " + negativos);
    System.out.println("Positivos: " + positivos);
  }
}

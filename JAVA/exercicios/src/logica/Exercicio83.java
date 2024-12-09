package logica;

import java.util.Scanner;

public class Exercicio83 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] nums = new int[7];
    int soma = 0;

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    for (int i : nums) {
      soma += i;
    }

    double media = soma / nums.length;

    scanner.close();

    System.out.println(media);
  }
}

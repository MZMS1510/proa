package logica;

import java.util.Scanner;

public class Exercicio82 {
  public static void main(String[] args) {
    int[] nums = new int[10];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    int soma = 0;

    for (int i : nums) {
      soma += i;
    }

    System.out.println(soma);
  }
}

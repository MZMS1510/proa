package logica;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio86 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    Arrays.sort(nums);
    System.out.println(nums);
  }
}
package logica;

import java.util.Scanner;

public class Exercicio81 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] nums = new int[5];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.println(nums[i]);
    }
  }
}

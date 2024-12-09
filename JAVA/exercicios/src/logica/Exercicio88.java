package logica;

import java.util.Scanner;

public class Exercicio88 {
  public static void main(String[] args) {
    int[] nums = new int[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite um número: ");
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    int somaPares = 0, quantPares = 0, somaImpares = 0, quantImpares = 0;

    for (int i : nums) {
      if (i % 2 == 0) {
        somaPares += i;
        quantPares++;
      } else {
        somaImpares += i;
        quantImpares++;
      }
    }

    double mediaPares = somaPares / quantPares;
    double mediaImpares = somaImpares / quantImpares;

    System.out.println("Média dos números pares: " + mediaPares);
    System.out.println("Média dos números ímpares: " + mediaImpares);
  }
}

package logica;

import java.util.Scanner;

public class Exercicio64 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();
    int factorial = 1;
    int i = 1;

    do {
      factorial *= i;
      i++;
    } while (i <= number);

    System.out.println("The factorial of " + number + " is " + factorial);
    scanner.close();
  }
}

package logica;

import java.util.Scanner;

public class Exercicio79 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();
    scanner.close();

    long factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }

    System.out.println("The factorial of " + number + " is " + factorial);
  }
}

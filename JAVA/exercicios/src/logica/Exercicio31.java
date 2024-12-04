package logica;

import java.util.Scanner;

public class Exercicio31 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do salário mínimo: ");
    double salarioMinimo = scanner.nextInt();

    System.out.print("Digite o valor do salário do funcionário: ");
    double salario = scanner.nextInt();

    scanner.close();

    int quantidadeSalarioMinimo = (int) (salario / salarioMinimo);

    System.out.println("O funcionário recebe " + quantidadeSalarioMinimo + " salário(s) mínimo(s)");
  }
}

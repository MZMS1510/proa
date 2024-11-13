package terceiraaula;

import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    float salarioEstagiario = 1400f;
    float salarioJunior = 3000f;
    float salarioPleno = 5500f;
    float salarioSenior = 8000f;
    float salarioMaster = 12000f;

    int codigo = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("1 - Estagiário");
    System.out.println("2 - Programador Júnior");
    System.out.println("3 - Programador Pleno");
    System.out.println("4 - Programador Sênior");
    System.out.println("5 - Programador Master");

    System.out.print("Digite o código do cargo: ");
    codigo = scanner.nextInt();

    scanner.close();

    switch (codigo) {
    case 1:
      System.out.println("Salário: R$ " + (salarioEstagiario + salarioEstagiario / 100 * 10));
      break;

    case 2:
      System.out.println("Salário: R$ " + (salarioJunior + salarioJunior / 100 * 12));
      break;

    case 3:
      System.out.println("Salário: R$ " + (salarioPleno + salarioPleno / 100 * 13));
      break;

    case 4:
      System.out.println("Salário: R$ " + (salarioSenior + salarioSenior / 100 * 15));
      break;

    case 5:
      System.out.println("Salário: R$ " + (salarioMaster + salarioMaster / 100 * 17));
      break;

    default:
      System.out.println("Código inválido");
      break;
    }
  }
}

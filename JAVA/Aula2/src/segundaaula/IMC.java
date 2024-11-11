package segundaaula;

import java.util.Scanner;

public class IMC {
  public static void main(String[] args) {
    // Informações necessárias
    float altura, peso, imc;
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite a sua altura (em metros): ");
    altura = leitor.nextFloat();

    System.out.print("Digite o seu peso (em quilogramas): ");
    peso = leitor.nextFloat();

    leitor.close();

    // Cálculo do IMC formula: peso / (altura * altura)
    imc = peso / (altura * altura);

    System.out.println("Seu IMC é: " + imc);

    if (imc <= 18.5) {
      System.out.println("Abaixo do peso.");
    } else if (imc < 25) {
      System.out.println("Peso ideal (parabéns!)");
    } else if (imc < 30) {
      System.out.println("Um pouco acima do peso");
    } else if (imc < 35) {
      System.out.println("Obesidade grau I");
    } else if (imc < 40) {
      System.out.println("Obesidade grau II");
    } else {
      System.out.println("Obesidade grau III ou mórbida");
    }
  }
}

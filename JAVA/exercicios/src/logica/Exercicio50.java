package logica;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int soma = 0, iteracoes = 0;

        while (true) {
            System.out.print("Digite um nome (fim para finalization): ");
            nome = scanner.next();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Digite uma idade: ");
            soma += scanner.nextInt();

            iteracoes++;
        }

        float media = soma / iteracoes;

        System.out.println("Média das idades: " + media);

        scanner.close();
    }
}

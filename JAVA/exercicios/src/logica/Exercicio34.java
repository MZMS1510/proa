package logica;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do eleitor: ");
        int idade = scanner.nextInt();

        scanner.close();

        if (idade >= 18 || idade <= 70) {
            System.out.println("Eleitor obrigatório");
        } else if (idade >= 16 || idade <= 17 || idade > 70) {
            System.out.println("Eleitor facultativo");
        } else {
            System.out.println("Não é eleitor");
        }
    }
}

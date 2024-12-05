package logica;

import java.util.Scanner;

public class Exercicio35 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int nota1, nota2, nota3;

    System.out.println("Digite as notas do aluno: ");
    nota1 = scanner.nextInt();
    nota2 = scanner.nextInt();
    nota3 = scanner.nextInt();

    scanner.close();

    float media = nota1 + nota2 + nota3 / 3;

    if (media >= 7) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Reprovado");
    }
}
}

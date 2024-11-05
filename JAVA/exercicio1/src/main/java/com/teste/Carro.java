package com.teste;

public class Carro {
  public String modelo;
  public String cor;
  public int numeroDePortas;
  public int numeroDeRodas;

  private int velocidadeAtual;
  private int velocidadeMaxima;

  public Carro(int numeroDePortas, int numeroDeRodas, String modelo, String cor) {
    this.velocidadeAtual = 0;
    this.velocidadeMaxima = 200;
    this.numeroDePortas = numeroDePortas;
    this.numeroDeRodas = numeroDeRodas;
    this.modelo = modelo;
    this.cor = cor;
  }

  public void acelerar() {
    if (velocidadeAtual < velocidadeMaxima) {
      velocidadeAtual++;
      System.out.println("Velocidade atual: " + velocidadeAtual);
    } else {
      System.out.println("Velocidade máxima atingida!");
    }
  }

  public void frear() {
    if (velocidadeAtual > 0) {
      velocidadeAtual--;
    } else {
      System.out.println("O carro já está parado!");
    }
  }
}

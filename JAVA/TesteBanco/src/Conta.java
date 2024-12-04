import java.util.Random;
import java.util.Scanner;

public class Conta {
  private String nomeTitular;
  private double saldo;
  private int numero;
  Scanner scanner = new Scanner(System.in);

  public Conta(String nomeTitular, double saldo) {
    this.nomeTitular = nomeTitular;
    this.saldo = saldo;

    Random random = new Random();

    this.numero = random.nextInt(1000);
  }

  private void verSaldo() {
    System.out.println("Número da conta: " + this.numero);
    System.out.println("Titular: " + this.nomeTitular);
    System.out.println("Saldo: " + this.saldo);
    System.out.println("\n");
  }

  private void sacar(double valor) {
    if (this.saldo <= valor) {
      System.out.println("Saldo insuficiente\n");
      return;
    }

    this.saldo = this.saldo - valor;
    System.out.println("Saque concluído");
    System.out.println("Seu saldo atual é de: " + this.saldo + "\n");
  }

  private void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("Depósito inválido\n");
      return;
    }

    this.saldo += valor;
    System.out.println("Depósito concluído");
    System.out.println("Seu saldo atual é de: " + this.saldo + "\n");
  }

  private void pedirEmprestimo(double valor) {
    if (this.saldo < valor) {
      System.out.println("Valor não liberado para empréstimo\n");
      return;
    }

    this.saldo += valor;
    System.out.println("Empréstimo concluído");
    System.out.println("Seu saldo atual é de: " + this.saldo + "\n");
  }

  private void pagarBoleto(double valor) {
    if (this.saldo < valor) {
      System.out.println("Saldo insuficiente para o pagamento\n");
      return;
    }

    this.saldo -= valor;
    System.out.println("Boleto pago\n");
    System.out.println("Saldo atual: " + this.saldo + "\n");
  }

  public void exibirMenu() {
    System.out.println("Bem vindo ao banco Vouvi");
    System.out.println("Escolha sua opção");
    System.out.println("1 - Ver saldo");
    System.out.println("2 - Sacar");
    System.out.println("3 - Depositar");
    System.out.println("4 - Pedir empréstimo");
    System.out.println("5 - Pagar boleto");
    System.out.println("6 - Finalizar");
    System.out.println("\n");
  }

  public void escolherOpcao(int opcao) {
    double valor;

    switch (opcao) {
      case 1:
        this.verSaldo();
        break;

      case 2:
        System.out.print("Digite o valor a ser sacado: ");
        valor = this.scanner.nextDouble();
        this.sacar(valor);
        break;

      case 3:
        System.out.print("Digite o valor a ser depositado: ");
        valor = this.scanner.nextDouble();
        this.depositar(valor);
        break;

      case 4:
        System.out.println("Digite o valor do empréstimo: ");
        valor = this.scanner.nextDouble();
        this.pedirEmprestimo(valor);
        break;

      case 5:
        System.out.println("Digite o valor do boleto: ");
        valor = this.scanner.nextDouble();
        this.pagarBoleto(valor);
        break;

      case 6:
        System.out.println("Adeus!");
        break;

      default:
        System.out.println("Operação inválida\n");
        break;
    }
  }

  public void init() {
    int opcao;

    do {
      this.exibirMenu();

      opcao = this.scanner.nextInt();

      this.escolherOpcao(opcao);
    } while (opcao != 6);
  }
}

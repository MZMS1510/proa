public class TelefoneCelular {
  // Atributos privados
  private String marca;
  private String modelo;
  private double preco;
  private int capacidadeBateria;
  private String sistemaOperacional;

  // Construtor
  public TelefoneCelular(String marca, String modelo, double preco, int capacidadeBateria, String sistemaOperacional) {
    this.marca = marca;
    this.modelo = modelo;
    this.preco = preco;
    this.capacidadeBateria = capacidadeBateria;
    this.sistemaOperacional = sistemaOperacional;
  }

  // Getters e Setters
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getCapacidadeBateria() {
    return capacidadeBateria;
  }

  public void setCapacidadeBateria(int capacidadeBateria) {
    this.capacidadeBateria = capacidadeBateria;
  }

  public String getSistemaOperacional() {
    return sistemaOperacional;
  }

  public void setSistemaOperacional(String sistemaOperacional) {
    this.sistemaOperacional = sistemaOperacional;
  }

}
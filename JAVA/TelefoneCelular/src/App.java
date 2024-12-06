public class App {
  public static void main(String[] args) {
    TelefoneCelular celular = new TelefoneCelular("Apple", "iPhone 12", 7999.99, 2815, "iOS 14");

    System.out.println("Marca: " + celular.getMarca());
    System.out.println("Modelo: " + celular.getModelo());
    System.out.println("Preço: " + celular.getPreco());
    System.out.println("Capacidade da bateria: " + celular.getCapacidadeBateria());
    System.out.println("Sistema operacional: " + celular.getSistemaOperacional());

    celular.setPreco(5999.99);
    System.out.println("Novo preço: " + celular.getPreco());
  }
}

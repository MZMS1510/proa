public class App {
  public static void main(String[] args) {
    FestaAniversario festa = new FestaAniversario();

    festa.setNomeAniversariante("Maria");
    festa.setIdadeAniversariante(10);
    festa.setDataFesta("12/12/2024");
    festa.setLocalFesta("Salão de Festas ABC");
    festa.setNumeroConvidados(50);

    System.out.println("Nome do Aniversariante: " + festa.getNomeAniversariante());
    System.out.println("Idade do Aniversariante: " + festa.getIdadeAniversariante());
    System.out.println("Data da Festa: " + festa.getDataFesta());
    System.out.println("Local da Festa: " + festa.getLocalFesta());
    System.out.println("Número de Convidados: " + festa.getNumeroConvidados());
  }
}

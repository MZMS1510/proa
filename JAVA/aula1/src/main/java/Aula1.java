public class Aula1 {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("azul", "esferográfica", 0.6f, 90, false);
        Caneta caneta2 = new Caneta("Vermelho", "hidrográfica", 0.7f, 20, true);

        caneta1.tampar();
        caneta1.estado();
        caneta1.rabiscar();

        System.out.println("-------------------------");

        caneta2.destampar();
        caneta2.estado();
        caneta2.rabiscar();
    }
}

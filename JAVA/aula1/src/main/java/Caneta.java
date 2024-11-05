public class Caneta {
    public String cor;
    public String modelo;
    public float ponta;
    public int carga;
    private boolean tampada; // Olá

    public void rabiscar() {
        if (tampada) {
            System.out.println("Não é possivel rabiscar");
        } else {
            System.out.println("Rabiscar");
        }
    }

    public void tampar() {
        System.out.println("Tampando");
        tampada = true;
    }

    public void destampar() {
        System.out.println("Destampando");
        tampada = false;
    }

    public void estado() {
        System.out.println("Esta caneta é do modelo: " + modelo);
        System.out.println("Esta caneta tem a cor: " + cor);
        System.out.println("Esta caneta tem a ponta: " + ponta);
        System.out.println("Esta caneta tem a carga: " + carga + "%");
        System.out.println("Esta caneta está tampada? " + tampada);
    }

    public Caneta(String cor, String modelo, float ponta, int carga, boolean tampada) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
}

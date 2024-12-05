package logica;

public class Exercicio60 {
    public static void main(String[] args) {
        int i = 0, a, b, c;
        a = 0;
        b = 1;
        c = 0;

        do {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

            i++;
        } while (i < 20);
    }
}

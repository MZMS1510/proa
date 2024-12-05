package logica;

public class Exercicio45 {
    public static void main(String[] args) {
        int i = 0, a, b, c;
        a = 0;
        b = 1;
        c = 0;

        while (i < 20) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

            i++;
        }
    }
}

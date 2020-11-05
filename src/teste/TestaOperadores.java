package teste;

public class TestaOperadores {

    public static void main(String[] args) {
        decremento();
    }

    public static void operadores() {
        int a = 10 + 5 - (7 + 4) - 20;
        System.out.println("A: " + a);
    }

    public static void somas() {
        int d = 3 + 4;
        System.out.println("D: " + d + 2);
        int a = 5;
        int b = 4;
        int c = a + b;
        System.out.println("C: " + c);
        System.out.println(c + a);
        System.out.println(5 + 3 + 2);
        System.out.println(5 + 3 + 2 + a);
    }

    public static void subtracoes() {
        int a = 4 - 3;
        System.out.println("A: " + a);
        int b = 5;
        int c = 3;
        int d = b - c;
        System.out.println("D: " + d);
        System.out.println(c - b);
        System.out.println(a - b - c);
        System.out.println(10 - 2 - a);
    }

    public static void exercicio1() {
        System.out.println(5 - 1);
    }

    public static int exercicio2() {
        return 5 + 4;
    }

    public static void multiplicacao() {

        int d = 3 * 4;
        System.out.println("D: " + d);

        int a = 5;
        int b = 4;
        int c = a * b;
        System.out.println("C: " + c);

        System.out.println(c * a);
        System.out.println(5 * 3 * 2);
        System.out.println(5 * 3 * 2 * a);
    }

    public static void divisao() {

        /*
        int d = 15 / 5;
        System.out.println("D: " + d);

        int a = 30;
        int b = 3;
        int c = a / b;
        System.out.println("C: " + c);

        System.out.println(a / c);
        System.out.println(10 / 2);
        System.out.println(12 / b);

         */

        int a = 7 / 2;
        System.out.println(a);


    }

    public static void divisaoPorZero(int a, int b) {

        System.out.println("Início da divisão");

        int c = a - b;
        int d = 8 / c;

        System.out.println("D: " + d);

    }

    public static void precedenciaDeOperadores() {
        System.out.println(8 + (2 - 4) * 2);
    }

    public static void incremento() {
        int a = 5;
        a++;   // igual a (a = a + 1)
        System.out.println("A: " + a);

        int b = 7;
        System.out.println(b++);  // 7
        System.out.println(b);    // 8

        // pre incremento
        int c = 12;
        ++c;       // igual a c = c + 1
        System.out.println("C:" + c);

        int d = 17;
        System.out.println(++d);     // 18
        System.out.println(d);       // 18
    }

    public static void decremento() {

        int a = 5;
        a--;   // igual a (a = a - 1)
        System.out.println("A: " + a);

        int b = 7;
        System.out.println(b--);  // 7
        System.out.println(b);    // 6


        // pre decremento
        int c = 12;
        --c;       // igual a c = c - 1
        System.out.println("C: " + c);


        int d = 17;
        System.out.println(--d);     // 16
        System.out.println(d);       // 16
    }

}

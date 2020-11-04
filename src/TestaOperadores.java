public class TestaOperadores {

    public static void main(String[] args) {

        int a = exercicio2();
        System.out.println(a);
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
}

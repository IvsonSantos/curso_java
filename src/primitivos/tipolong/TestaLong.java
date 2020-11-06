package primitivos.tipolong;

public class TestaLong {

    /*
        São números inteiros como 0, 1, 2, 3...
        32 bits = int
        Tamanho de 64 bits = long
        Pode ter valores entre -9223372036854775808 a 9223372036854775808
        2 elevado a 64 igual a 18446744073709551616
     */

    public static void main(String[] args) {
        TestaLong testaLong = new TestaLong();
        testaLong.converteIntLong();
    }

    public void somaLong() {
        long a = 1200L;
        long b = 2800L;
        long c = a + b;
        System.out.println("C: " + c);
    }

    public void subtrairLong() {
        long a = 1200L;
        long b = 2800L;
        long c = a - b;
        System.out.println("C: " + c);
    }

    public void multiplicaLong() {
        long a = 1200L;
        long b = 2800L;
        long c = a * b;
        System.out.println("C: " + c);
    }

    public void divideLong() {
        long a = 20000L;
        long b = 2000L;
        long c = a / b;
        System.out.println("C: " + c);
    }

    public void validaExcecoesNoLong() {
        long a = 2000000000000000000L;
        long b = 2000000000000000000L;
        long c = a * b;
        System.out.println("C: " + c);
    }

    public void converteIntLong() {

        // tipos sao int
        int a = 10;
        int b = 20;
        // para um long
        long c = a + b;
        // o long é maior do que o int entao ele cabe
        long e = a;
        System.out.println("C: " + c);

        long l1 = 1;
        long l2 = 200L;

        // o int é menor do que o long, entao nao cabe
        // int d = l1;

    }

}

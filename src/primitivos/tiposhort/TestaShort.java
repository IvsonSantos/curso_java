package primitivos.tiposhort;

import java.util.Scanner;

/**
 * São números inteiros como 0, 1, 2, 3...
 *
 * Tamanho de 16 bits.   int(32 bits)  long (64 bits)
 *
 * Pode ter valores entre -32768 a 32767
 *
 * Utilizado para preservar memória em valores inteiros.
 */
public class TestaShort {

    long a;     // 64 bits na memoria RAM
    int b;      // 32 bits na memoria RAM
    short c;    // 16 bits na memoria RAM

    public static void main(String[] args) {

        short s = 15;
        short d = 10;

        System.out.println("O valor de S é: " + s);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um short");
        short c = scanner.nextShort();
        System.out.println("Voce informou: " + c);

        d = s;
        System.out.println("D: "+ d);

    }

}

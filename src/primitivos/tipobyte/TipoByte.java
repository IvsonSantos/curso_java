package primitivos.tipobyte;

import java.util.Scanner;

/**
 * São valores numéricos de pequeno tamanho.
 *
 * Tem o tamanho de 8 bits.  (2^8 = 256)
 *
 * Varia entre -128 e 127.
 *
 * É recomendado para ser preservar memória.
 */
public class TipoByte {

    byte e;

    public static void main(String[] args) {

        byte a = 25;
        System.out.println("A: " + a);

        // tamanho do byte maximo de 127
        // byte b = 129;

        int c = 10;
        c = a;

        byte d = 30;
        // int nao cabe em um byte
        //d = c;

        TipoByte tipoByte = new TipoByte();
        System.out.println("Valor padrao do byte: " +tipoByte.e);

        Scanner s = new Scanner(System.in);
        System.out.println("Informe um BYTE");
        byte resultado =  s.nextByte();
        System.out.println("Voce digitou: " + resultado);
    }
}

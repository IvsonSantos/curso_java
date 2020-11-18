package primitivos.tipochar;

import java.util.Scanner;

public class ValoresEmChar {

    char a;

    public static void main(String[] args) {

        // valor padrao do char
        ValoresEmChar valoresEmChar = new ValoresEmChar();
        System.out.println("Valor padrão: " +valoresEmChar.a);

        // utilizar o Scanner com char
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um char:");
        char b = scanner.next().charAt(2);
        System.out.println("B: " + b);
    }
}

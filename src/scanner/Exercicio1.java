package scanner;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o 1o numero:");
        int a = entrada.nextInt();

        System.out.println("Informe o 2o numero:");
        int b = entrada.nextInt();

        int c = a + b;
        System.out.println("O resultado da soma é: " + c);

    }
}

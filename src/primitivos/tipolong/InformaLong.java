package primitivos.tipolong;

import java.util.Scanner;

public class InformaLong {

    public static void main(String[] args) {

        System.out.println("Informe um long:");

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();

        // nao vai compilar
        // int b = scanner.nextLong();


        System.out.println("Voce informou o numero: " + a);

        System.out.println("Informe um int:");
        long c = scanner.nextInt();
        System.out.println("Voce informou agora: " + c);

    }


}

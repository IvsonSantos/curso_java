package string;

import java.util.Scanner;

public class StringTrim {

    public static void main(String[] args) {

        // sem espacos
        String teste = new String("Bom dia, como vai voce?");
        System.out.println(teste);

        // com espacos
        String teste2 = new String("    Bom dia, como vai voce?");
        System.out.println(teste2.trim());


        String teste3 = new String("    Bom dia, como vai voce?         ");
        System.out.println(teste3);


        // validar uma senha informada
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha:");
        //String senha = scanner.nextLine();
        //System.out.println(senha.trim());
    }

}

package scanner;

// local onde a classe Scanner se encontra (packages ou pastas)
import java.util.Scanner;

public class TestaScanner {

    public static void main(String[] args) {

        // variavel = tipo + nome (int a)
        // variavel = tipo + nome (Scanner scanner)
        // new Scanner() = criando efetivamente o objeto Scanner em memoria
        Scanner entrada = new Scanner(System.in);

        // pedindo para digitar qualquer coisa
        System.out.println("Informe qualquer coisa e aperte ENTER:");
        String s = entrada.nextLine();
        System.out.println("Voce informou o texto: " + s);

        // pedindo para digitar um inteiro
        System.out.println("Informe um número e aperte ENTER:");
        int a = entrada.nextInt();
        System.out.println("Voce informou o numero: " + a);


    }

}

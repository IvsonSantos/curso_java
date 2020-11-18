package string;

public class TestaString {



    public static void main(String[] args) {

        // inicializando uma string

        // 1a forma, passar a string diretamente
        String palavra = "Ola";
        System.out.println("A 1a String é: " + palavra);

        // 2a forma, criar um objeto String e atribuir o valor
        String teste = new String();
        teste = "Tudo bem?";
        System.out.println("A 2a String é: " + teste);

        // 3a forma, atribuir diretamente no construtor do string
        String palavra3 = new String("Nova palavra");
        System.out.println("A 3a String é: " + palavra3);

        // teste - valor vazio
        String palavra4 = new String("");
        System.out.println("A 4a String é: " + palavra4);



    }

}

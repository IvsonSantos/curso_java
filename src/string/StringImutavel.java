package string;

public class StringImutavel {

    public static void main(String[] args) {

        // assim que criamos uma String, ela é imutavel
        String palavra = new String("bom dia"); // foi criado um espaco na memoria para um String chamado palavra

        System.out.println(palavra);

        System.out.println(palavra.toUpperCase());

        // nesse caso, criacao de uma segunda String
        palavra = palavra.toUpperCase();            // esta sendo criado um novo espaco na memoria para a String chamada palavra
        System.out.println(palavra);    // BOM DIA


        // 3 strings sendo criadas
        String a = "A";
        a = "B";
        a = "C";
    }

}

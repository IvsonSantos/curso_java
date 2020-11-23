package string;

public class StringContains {

    public static void main(String[] args) {

        String primeiro = "Bom dia, tudo bem?";
        System.out.println(primeiro);

        String palavra = primeiro.toLowerCase();
        boolean contem = palavra.contains("bom dia");
        System.out.println("Contem a palavra desejada? " + contem);

        // mais uma forma de trabalhar com Strings
        System.out.println("curso de java".toUpperCase());
    }

}

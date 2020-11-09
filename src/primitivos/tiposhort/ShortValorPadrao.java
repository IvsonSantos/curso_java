package primitivos.tiposhort;

public class ShortValorPadrao {

    // variaveis da classe
    long a;
    int b;
    short c;

    public static void main(String[] args) {

        short d;
        // nao compila pois nao temos valor na variavel D
        // System.out.println("O valor em D: " + d);


        // criar um objeto desta classe
        ShortValorPadrao shortValorPadrao = new ShortValorPadrao();
        System.out.println("O valor em C: " + shortValorPadrao.c);

        System.out.println("O valor padrao pro long é: " + shortValorPadrao.a);
        System.out.println("O valor padrao pro int é: " + shortValorPadrao.b);
    }


}

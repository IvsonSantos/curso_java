package string;

public class StringValorPadrao {

    String palavra;

    public static void main(String[] args) {

        // valor padrao é "" (vazio)
        String variavelLocal = new String();
        System.out.println("A: " + variavelLocal);

        // nesse caso, receberemos um valor null
        StringValorPadrao variavelDaClasse = new StringValorPadrao();
        System.out.println("B: " + variavelDaClasse.palavra);

        // outra variavel local, 2o teste, nao funciona pois é uma variavel local
        String segundaVariavel;
        //System.out.println("C: " + segundaVariavel);

    }
}

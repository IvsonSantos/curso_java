package string;

public class StringValorPadrao {

    String palavra;         // crie para mim uma variavel chamada variavelLocal do tipo String

    public static void main(String[] args) {

        // valor padrao é "" (vazio)

        // new String, reserva na memoria um espaco onde caiba o tipo String, com o tamanho dele e o tipo
        // String variavelLocal, crie para mim uma variavel chamada variavelLocal do tipo String
        // Aquele objeto que esta na memoria que voce criou com o new, por favor, aponte/atribua esta variavel "variavelLocal" para este espaco de memmoria
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

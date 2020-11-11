package primitivos.tipodouble;

/**
 * São números de ponto flutuante de dupla precisão.
 *
 * Tamanho de 64 bits.  (float 32 bits)
 *
 * É recomendado para ser utilizado com valores decimais, mas não para valores mais precisos, como dinheiro por exemplo.
 *
 * Para dinheiro podemos utilizar o java.math.BigDecimal.
 */
public class TestaDouble {

    double e;

    public static void main(String[] args) {

        // operacoes com o double

        /*
        float a = 10f / 3f;
        System.out.println("A: " + a);

        double c = 10d / 3d;
        System.out.println("C: " + c);

        // float cabe em um double
        double teste = 20f / 7f;
        // erro pois double nao cabe em um float
        //float teste2 = 20d / 7d;

        double resultado = a / 2d;
        System.out.println("Resultado: " + resultado);
         */


        // divisao com double
        int a = 10;
        double b = 10d;

        System.out.println("Divisao com int: " + 0 / a);
        System.out.println("Divisao com double: " + 0 / b);


        // vai dar erro de execucao
        //System.out.println("Divisao int: " + a / 0);

        System.out.println("Divisao double: " + b / 0);

        TestaDouble testaDouble = new TestaDouble();
        System.out.println("Valor padrão: " + testaDouble.e);

        /*
        // quebra a logica pois retorna infinito
        float c = b / 0;
        System.out.println("C: " + c);

        float ultimo = 10f + c;
        System.out.println("Ultimo: " + ultimo);
        */

    }


}

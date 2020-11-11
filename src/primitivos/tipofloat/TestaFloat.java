package primitivos.tipofloat;

/**
 * São números de ponto flutuante como 1.5, 2.2, 3.25
 *
 * Tamanho de 32 bits.
 *
 * Utilizado para preservar memória em valores de ponto flutuante.
 *
 * Não é recomendado para ser utilizado com valores precisos, como dinheiro por exemplo.
 *
 * Para dinheiro podemos utilizar o java.math.BigDecimal.
 */
public class TestaFloat {

    // int, long, short = numeros inteiros
    // float = numeros decimais

    public static void main(String[] args) {

        int b = 10;
        float a = 10;
        float c = 22.37f;

        System.out.println("O valor de A: " + a);

        System.out.println("O valor de B: " + b);

        System.out.println("O valor de C é: " + c);

    }


}

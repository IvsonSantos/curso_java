package primitivos.tipochar;

/**
 * São valores de caracter Unicode.
 *
 * Tem o tamanho de 16 bits.
 *
 * Varia entre \u0000 e \uffff.
 *
 * Uma lista de unicodes pode ser vista na wikipedia procurando por: list_of_Unicode_characters
 *
 * Exemplo: U+0126, U+01B1 e U+00FF
 */
public class TipoChar {

    public static void main(String[] args) {

        char a = 'a';
        System.out.println("A: " + a);

        char b = 'F';
        System.out.println("B: " + b);

        char c = '\u0126';
        System.out.println("C: " + c);

        char d = '\u01B1';
        System.out.println("D: " + d);

        char e = '\u00FF';
        System.out.println("E: " + e);

    }

}

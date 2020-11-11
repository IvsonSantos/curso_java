package primitivos.tiposhort;

public class AtribuiShort {

    public static void main(String[] args) {

        long b = 20;
        int a = 10;
        short c = 30;

        // ok, mesmo tamanho
        short d = c;

        // nao compila pois o long é maior que o short
        // short e = b;

        // nao compila pois o int é maior que o short
        // short f = a;

        // int e long sao maiores que o short, entao ele compila
        int g = c;
        long h = c;


    }

}

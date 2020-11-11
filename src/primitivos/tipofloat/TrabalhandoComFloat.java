package primitivos.tipofloat;

public class TrabalhandoComFloat {

    public static void main(String[] args) {

        // operacoes com o float
        /*
        int a = 10/3;
        System.out.println("A: " + a);

        float b = 10/3;
        System.out.println("B: " + b);

        float c = 10f/3f;
        System.out.println("C: " + c);

        float teste = 20f/7f;
        float resultado = a / 2f;
        System.out.println("Resultado: " + resultado);

         */

        int a = 10;
        float b = 10f;

        System.out.println("Divisao com int: " + 0 / a);

        System.out.println("Divisao com float: " + 0 / b);

        // vai dar erro de execucao
        //System.out.println("Divisao int: " + a / 0);

        System.out.println("Divisao float: " + b / 0);

        // quebra a logica pois retorna infinito
        float c = b / 0;
        System.out.println("C: " + c);

        float ultimo = 10f + c;
        System.out.println("Ultimo: " + ultimo);


    }
}

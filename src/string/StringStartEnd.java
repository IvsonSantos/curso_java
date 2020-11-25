package string;

public class StringStartEnd {

    public static void main(String[] args) {

        String exemplo = new String("LIV - Jornal da vida e diario");
        String exemplo2 = new String("COZ - Jornal da vida e diario");

        // comecando com uma palavra desejada
        boolean inicio = exemplo.startsWith("LIV");
        System.out.println("Início: " + inicio);

        // terminando com uma palavra desejada
        boolean fim = exemplo2.endsWith("diario");
        System.out.println("Fim: " + fim);

    }

}

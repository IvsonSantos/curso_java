package string;

public class StringSubstring {

    public static void main(String[] args) {

        String a = new String("minha palavra desejada");
        System.out.println("Palavra inteira: " + a);

        // subtring, vai mostrar apenas os caracteres selecionados,
        System.out.println("Pegando os 5 primeiros: " + a.substring(0, 5));

        System.out.println("Comecando do 6: " + a.substring(6));

        System.out.println("Comecando do 6 ate o 12: " + a.substring(6, 13));
    }

}

package teste;

public class TestaMetodosComRetorno {

    public static void main(String[] args) {

        int a = 0;

        a = retornaSoma();  // o retorno e 8
        a = 11;

        System.out.println("A: " + a);

    }

    public static int retornaSoma() {
        return 11;
    }

}

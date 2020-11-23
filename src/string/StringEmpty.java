package string;

public class StringEmpty {

    public static void main(String[] args) {

        String a = new String("teste");
        System.out.println("O valor de a é: " + a);
        System.out.println("Esta vazio: " + a.isEmpty());

        String b = new String("");
        System.out.println("O valor de b é: " + b);
        System.out.println("Esta vazio: " + b.isEmpty());

        String c = new String();
        System.out.println("O valor de c é: " + c);
        System.out.println("Esta vazio: " + c.isEmpty());

        String d = "";
        System.out.println("O valor de d é: " + d);
        System.out.println("Esta vazio: " + d.isEmpty());


        String f = new String("   ");
        f = f.trim();
        System.out.println("O valor de f é: " + f);
        System.out.println("Esta vazio: " +  f.isEmpty());

    }


}

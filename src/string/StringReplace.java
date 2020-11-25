package string;

public class StringReplace {

    public static void main(String[] args) {

        String a = "Minha palavra desejada é esta, mas a palavra poderia ser qualquer outra palavra";
        System.out.println("A: " + a);

        String b = a.replace("palavra", "texto");
        System.out.println("B: " + b);


        String c = "A casa é de papel";
        String d = c.replace('a', 'u');
        System.out.println("D: " + d);

    }

}

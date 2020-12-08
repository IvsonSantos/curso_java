package condicionais;

public class TestaIfElse {

    public static void main(String[] args) {

        int notaA = 5;
        int notaB = 8;
        int notaC = 10;

        if (notaA >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        if (notaB == 10) {
            System.out.println("Nota igual a 10");
        } else {
            System.out.println("Nota igual a " + notaB);
        }


        if (notaC < 7) {
            System.out.println("Aluno reprovado");
        } else if (notaC >= 7 && notaC < 10) {
            System.out.println("Aprovado");
        } else if (notaC == 10) {
            System.out.println("Parabens!!!");
        }

    }

}

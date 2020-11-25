package condicionais;

public class TestaIf {

    public static void main(String[] args) {

        // estrutura condicional, alguma coisa so vai acontecer sob determinada condicao

        // condicao para aprovado é ter a nota entre 7 e 10
        // caso a nota do aluno seja menor do que 7, ele é reprovado
        // nota entre 0 e 6,9 faz com que o aluno esteja reprovado
        // nota entre 7 e 10 faz com que o aluno esteja aprovado

        int notaAlunoA = 8;
        int notaAlunoB = 5;

        System.out.println("Condicao Aluno A: " + (notaAlunoA >= 7));
        System.out.println("Condicao Aluno B: " + (notaAlunoB >= 7));

        // primeira condicao, aluno aprovado
        if (notaAlunoA >= 7) {  // true
            System.out.println("O aluno A esta aprovado com a nota: " + notaAlunoA);
        }

        if (notaAlunoB >= 7) {  // false
            System.out.println("O aluno B esta aprovado com a nota: " + notaAlunoB);
        }

    }

}

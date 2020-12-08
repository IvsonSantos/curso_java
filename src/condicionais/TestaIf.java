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
        int notaAlunoC = 10;

        /*
        // primeira condicao, aluno aprovado
        if (notaAlunoA >= 7) {  // true
            System.out.println("O aluno A esta aprovado com a nota: " + notaAlunoA);
        }
        // segunda condicao, aluno reprovado
        if (notaAlunoA < 7) {
            System.out.println("O aluno A esta reprovado com a nota: " + notaAlunoA);
        }


        if (notaAlunoB >= 7) {  // false
            System.out.println("O aluno B esta aprovado com a nota: " + notaAlunoB);
        }
        if (notaAlunoB < 7) { // true
            System.out.println("O aluno B esta reprovado com a nota: " + notaAlunoB);
        }
                    */

        if (notaAlunoC >= 7) {

            if (notaAlunoC >= 7 && notaAlunoC < 10){
                System.out.println("O aluno C esta aprovado com a nota: " + notaAlunoC);
            }

            if (notaAlunoC == 10) {
                System.out.println("Parabens, nota maxima");
            }
        }
        if (notaAlunoC < 7) {
            System.out.println("O aluno C esta reprovado com a nota: " + notaAlunoC);
        }


    }

}

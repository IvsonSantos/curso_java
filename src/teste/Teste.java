package teste;

/**
 * Esta é uma anotacao de classe
 */
public class Teste {

    int idade;
    int tamanhoEmAltura;    

    public static void main(String[] args) {

        
        // ira imprimir meu nome na mesma linha
        System.out.print("Ivson ");
        System.out.print("Santos");
    } // fim do main()

    /**
     * Imprimir meu nome diferente
     */
    public void metodoA() {
        System.out.print("Ivson");
    }  // fim do metodoA

    public void metodoB() {

        if (true) {
            System.out.print("Ok agora ");
        } // fim do if - true
        
        System.out.print("Ivson ");
        System.out.print("Ivson ");
        System.out.print("Ivson ");
        System.out.print("Outra coisa ");
        System.out.print("Ivson ");
    } // fim do metodoB

}

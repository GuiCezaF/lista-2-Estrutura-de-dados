public class Collatz {

    /*
     * 
     * A sequência de Collatz, também conhecida como problema 3n + 1, é uma
     * sequência de
     * números naturais gerada a partir de um número inicial n e que siga as
     * seguintes duas
     * regras:
     * Se n for par, deve-se dividir n por 2.
     * Se n for ímpar, multiplique n por 3 e some 1.
     * Termina com os últimos números da sequência sendo 4, 2, 1.
     * Crie uma função recursiva chamada imprimeSeqCollatz que receba um número
     * inteiro positivo e imprima todos os números desta sequência.
     * 
     */

    public static void imprimeSeqCollatz(int n) {
        if (n <= 0) {
            System.out.println("Erro. Considere apenas números estritamente positivos");
        } else {
            System.out.print(n + " ");
            if (n == 1) {
                return;
            } else if (n % 2 == 0) {
                imprimeSeqCollatz(n / 2);
            } else {
                imprimeSeqCollatz(n * 3 + 1);
            }
        }
    }

    public static void main(String[] args) {

        // Caso 1
        int caso_1 = 6;
        System.out.printf("Sequência de Collatz para %s => ", caso_1);
        imprimeSeqCollatz(caso_1);
        System.out.println("\n");

        // Caso 2
        int caso_2 = 10;
        System.out.printf("Sequência de Collatz para %s => ", caso_2);
        imprimeSeqCollatz(caso_2);
        System.out.println("\n");

        // Caso 3
        int caso_3 = -100;
        System.out.printf("Sequência de Collatz para %s => ", caso_3);
        imprimeSeqCollatz(caso_3);
        System.out.println("\n");

        // Caso 4
        int caso_4 = 100;
        System.out.printf("Sequência de Collatz para %s => ", caso_4);
        imprimeSeqCollatz(caso_4);
        System.out.println("\n");
    }

}

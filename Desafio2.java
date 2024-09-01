import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro e te direi se pertence ao Fibonacci: ");
        int numeroEscolhido = scan.nextInt();

        int primeiroFibonacci = 0;
        int segundoFibonacci = 1;
        int reserva = 1;
        boolean pertence = false;

        if (numeroEscolhido == primeiroFibonacci || numeroEscolhido == segundoFibonacci) {
            pertence = true;
        }

        // (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...)
        System.out.println("Esta é a Sequencia de Fibonacci: ");
        System.out.print(primeiroFibonacci + " , ");
        System.out.print(segundoFibonacci + " , ");

        for(int i = 1; segundoFibonacci <= numeroEscolhido; i++) {
            System.out.print(reserva + " , ");
            primeiroFibonacci = segundoFibonacci;
            segundoFibonacci = reserva;
            reserva = primeiroFibonacci + segundoFibonacci;

            if (numeroEscolhido == primeiroFibonacci || numeroEscolhido == segundoFibonacci) {
                pertence = true;
            }
        }

        System.out.print(primeiroFibonacci + segundoFibonacci + " ... ");
        System.out.println();
        System.out.println();

        if (pertence) {
            System.out.println("SEU NÚMERO PERTENCE A SEQUENCIA DE FIBONACCI! =) ");
        } else {
            System.out.println("SEU NÚMERO NÃO PERTENCE A SEQUENCIA DE FIBONACCI! =( ");
        }
    }
}

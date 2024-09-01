import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um frase que eu inverterei ela: ");
        String frase = scan.nextLine();

        char[] caracteres = frase.toCharArray();
        char[] invertida = new char[caracteres.length];

        for(int i = 0; i < caracteres.length; i++) {
            invertida[i] = caracteres[caracteres.length - 1 - i];
        }

        String fraseInversa = new String(invertida);
        System.out.println(fraseInversa);
    }
}

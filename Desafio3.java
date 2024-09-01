public class Desafio3 {
    public static void main(String[] args) {
        int vetorFaturamento[] = new int[31];
        int contagemDias = 0;

        //supondo que o faturamento diario seja até R$10.000
        for (int i = 0; i < 31; i++) {
            vetorFaturamento[i]  = (int)Math.round(Math.random() * 10000);
            System.out.println("dia " + i + " = " + vetorFaturamento[i]);
        }

        int maiorValor = vetorFaturamento[0];
        int menorValor = vetorFaturamento[0];
        float media = 0;
        int totalFaturamento = 0;

        for (int i = 0; i < 31; i++) {
            if (vetorFaturamento[i] > maiorValor) {
                maiorValor = vetorFaturamento[i];
            }
            if (vetorFaturamento[i] < menorValor) {
                menorValor = vetorFaturamento[i];
            }
            totalFaturamento += vetorFaturamento[i];
        }

        media = totalFaturamento / 30;

        for (int i = 0; i < 31; i++) {
            if (vetorFaturamento[i] > media) {
                contagemDias++;
            }
        }

        System.out.println("O menor valor de faturamento foi: R$" + menorValor);
        System.out.println("O maior valor de faturamento foi: R$" + maiorValor);
        System.out.println("Número de dias em que o valor de faturamento foi superior à média mensal: " + contagemDias + " dias.");
    }
}

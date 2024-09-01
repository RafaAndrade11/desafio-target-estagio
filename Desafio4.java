public class Desafio4 {
    public static void main(String[] args) {
        float SP = 67836.43f;
        float RJ = 36678.66f;
        float MG = 29229.88f;
        float ES = 27165.48f;
        float outros = 19849.53f;

        double totalFaturamento = SP + RJ + MG + ES + outros;

        System.out.printf("O percentual de SP foi: %.2f%%\n", media(SP, totalFaturamento));
        System.out.printf("O percentual de RJ foi: %.2f%%\n", media(RJ, totalFaturamento));
        System.out.printf("O percentual de MG foi: %.2f%%\n", media(MG, totalFaturamento));
        System.out.printf("O percentual de ES foi: %.2f%%\n", media(ES, totalFaturamento));
        System.out.printf("O percentual de outros foi: %.2f%%\n", media(outros, totalFaturamento));
    }
    private static double media(double valor, double totalFaturamento) {
        return (valor / totalFaturamento) * 100;
    }
}

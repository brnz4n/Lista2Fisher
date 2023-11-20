package questoes;

public class Questao19 {

    public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int numeroPeriodos) {
        if (valorInicial < 0 || taxaJuros < 0 || numeroPeriodos < 0) {
            throw new IllegalArgumentException("Os parâmetros não podem ser negativos.");
        }

        return valorInicial * Math.pow(1 + taxaJuros, numeroPeriodos);
    }

    public static void main(String[] args) {
        double valorInicial = 1000;
        double taxaJuros = 0.05;
        int numeroPeriodos = 3;

        double valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, numeroPeriodos);
        System.out.printf("Valor final após juros compostos: %.2f%n", valorFinal);
    }
}

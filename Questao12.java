package questoes;

public class Questao12 {

    public static double calcularPotencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }

    public static void main(String[] args) {
        double base = 2.5;
        int expoente = 3;

        double resultadoPotencia = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultadoPotencia);
    }
}

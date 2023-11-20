package questoes;

public class Questao17 {

    public static boolean verificarNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numero = 7;

        boolean ehPrimo = verificarNumeroPrimo(numero);
        System.out.println(numero + " é um número primo? " + ehPrimo);
    }
}

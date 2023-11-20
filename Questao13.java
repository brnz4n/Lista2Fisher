package questoes;

public class Questao13 {

    public static boolean verificarPrimo(int numero) {
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
        int numero1 = 7;
        int numero2 = 10;

        System.out.println(numero1 + " é primo: " + verificarPrimo(numero1)); // true
        System.out.println(numero2 + " é primo: " + verificarPrimo(numero2)); // false
    }
}

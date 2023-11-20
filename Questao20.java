package questoes;

public class Questao20 {

    public static boolean verificarNumeroPerfeito(int numero) {
        if (numero <= 1) {
            return false;
        }

        int somaDivisores = 1;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                somaDivisores += i;
                if (i != numero / i) {
                    somaDivisores += numero / i;
                }
            }
        }

        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        int numero = 6;

        boolean ehPerfeito = verificarNumeroPerfeito(numero);
        System.out.println(numero + " é um número perfeito? " + ehPerfeito);
    }
}

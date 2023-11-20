package questoes;

import java.util.Arrays;

public class Questao11 {

    public static boolean verificarIgualdade(int[] vetor1, int[] vetor2) {
        if (vetor1 == null || vetor2 == null) {
            throw new IllegalArgumentException("Os vetores não podem ser nulos.");
        }

        return Arrays.equals(vetor1, vetor2);
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {1, 2, 3, 4, 5};
        int[] vetor3 = {5, 4, 3, 2, 1};

        System.out.println("Vetor1 é igual a Vetor2: " + verificarIgualdade(vetor1, vetor2)); // true
        System.out.println("Vetor1 é igual a Vetor3: " + verificarIgualdade(vetor1, vetor3)); // false
    }
}

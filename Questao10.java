package questoes;

import java.util.Arrays;

public class Questao10 {

    public static int encontrarKEsimoMenor(int[] vetor, int k) {
        if (vetor == null || vetor.length == 0 || k <= 0 || k > vetor.length) {
            throw new IllegalArgumentException("Parâmetros inválidos.");
        }

        int[] copia = Arrays.copyOf(vetor, vetor.length);
        Arrays.sort(copia);

        return copia[k - 1];
    }

    public static void main(String[] args) {
        int[] vetor = {3, 1, 7, 4, 2, 9};
        int k = 3;

        int kmenor = encontrarKEsimoMenor(vetor, k);
        System.out.println("O " + k + "-ésimo menor valor é: " + kmenor);
    }
}

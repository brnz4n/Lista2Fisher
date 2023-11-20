package questoes;

import java.util.Arrays;

public class Questao7{

    public static int[] ordenarCrescente(int[] vetor) {
        if (vetor == null) {
            throw new IllegalArgumentException("O vetor não pode ser nulo.");
        }

        int[] copia = Arrays.copyOf(vetor, vetor.length);
        Arrays.sort(copia);

        return copia;
    }

    public static void main(String[] args) {
        int[] vetorOriginal = {5, 2, 9, 1, 7};
        int[] vetorOrdenado = ordenarCrescente(vetorOriginal);

        System.out.println("Vetor Original:    " + Arrays.toString(vetorOriginal));
        System.out.println("Vetor Ordenado: " + Arrays.toString(vetorOrdenado));
    }
}

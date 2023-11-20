package questoes;

import java.util.Arrays;

public class Questao21 {

    public static int[] criarVetorDiminuindo(int tamanho) {
        if (tamanho <= 0) {
            throw new IllegalArgumentException("O tamanho do vetor deve ser maior que zero.");
        }

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i + 1;
        }

        return vetor;
    }

    public static void main(String[] args) {
        int tamanhoInicial = 5;

        for (int tamanho = tamanhoInicial; tamanho >= 1; tamanho--) {
            int[] vetor = criarVetorDiminuindo(tamanho);
            System.out.println("Vetor de tamanho " + tamanho + ": " + Arrays.toString(vetor));
        }
    }
}

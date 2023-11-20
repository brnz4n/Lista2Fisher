package questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao15 {

    public static int[] removerElemento(int[] vetor, int elemento) {
        if (vetor == null) {
            throw new IllegalArgumentException("O vetor não pode ser nulo.");
        }

        List<Integer> novoVetor = new ArrayList<>();

        for (int valor : vetor) {
            if (valor != elemento) {
                novoVetor.add(valor);
            }
        }

        return novoVetor.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] vetorOriginal = {1, 2, 3, 2, 4};
        int elementoRemover = 2;

        int[] vetorModificado = removerElemento(vetorOriginal, elementoRemover);

        System.out.println("Vetor Original:    " + Arrays.toString(vetorOriginal));
        System.out.println("Vetor Modificado: " + Arrays.toString(vetorModificado));
    }
}

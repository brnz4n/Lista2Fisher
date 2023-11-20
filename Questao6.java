package questoes;

import java.util.Arrays;

public class Questao6 {

	    public static int[] copiarVetor(int[] vetor) {
	        if (vetor == null) {
	            throw new IllegalArgumentException("O vetor não pode ser nulo.");
	        }

	        int[] copia = new int[vetor.length];

	        for (int i = 0; i < vetor.length; i++) {
	            copia[i] = vetor[i];
	        }

	        return copia;
	    }

	    public static void main(String[] args) {

	        int[] vetorOriginal = {1, 2, 3, 4, 5};
	        int[] vetorCopia = copiarVetor(vetorOriginal);

	        System.out.println("Vetor Original: " + Arrays.toString(vetorOriginal));
	        System.out.println("Vetor Cópia:    " + Arrays.toString(vetorCopia));
	    }
	}



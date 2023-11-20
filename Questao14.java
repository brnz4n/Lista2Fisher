package questoes;

import java.util.Arrays;

public class Questao14 {

    public static int[] buscarOcorrenciasComuns(int[] vetor1, int[] vetor2) {
        if (vetor1 == null || vetor2 == null) {
            throw new IllegalArgumentException("Os vetores não podem ser nulos.");
        }

        int tamanhoMaximo = Math.min(vetor1.length, vetor2.length);
        int[] ocorrenciasComuns = new int[tamanhoMaximo];
        int contador = 0;

        for (int valor : vetor1) {
            if (contemElemento(vetor2, valor) && !contemElemento(ocorrenciasComuns, valor)) {
                ocorrenciasComuns[contador++] = valor;
            }
        }

        return Arrays.copyOfRange(ocorrenciasComuns, 0, contador);
    }

    private static boolean contemElemento(int[] vetor, int elemento) {
        for (int valor : vetor) {
            if (valor == elemento) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {3, 4, 5, 6, 7};

        int[] ocorrenciasComuns = buscarOcorrenciasComuns(vetor1, vetor2);
        System.out.println("Ocorrências comuns nos vetores: " + Arrays.toString(ocorrenciasComuns));
    }
}

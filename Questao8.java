package questoes;

public class Questao8{

    public static boolean verificarOrdenacaoCrescente(int[] vetor) {
        if (vetor == null || vetor.length < 2) {
            throw new IllegalArgumentException("O vetor deve ter pelo menos dois elementos.");
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        int[] vetorNaoOrdenado = {5, 2, 9, 1, 7};

        System.out.println("Vetor Ordenado: " + verificarOrdenacaoCrescente(vetorOrdenado)); // true
        System.out.println("Vetor Não Ordenado: " + verificarOrdenacaoCrescente(vetorNaoOrdenado)); // false
    }
}

package questoes;

public class Questao1 {
    public static int calcularSomatorio(int[] vetor) {
 
        if (vetor == null || vetor.length < 4) {
            throw new IllegalArgumentException("O vetor deve ter pelo menos 4 elementos");
        }

        int soma = 0;

        for (int i = 2; i < vetor.length - 2; i++) {
            soma += vetor[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        int[] exemploVetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rSomatorio = calcularSomatorio(exemploVetor);
        System.out.println("Somatório excluindo as primeiras duas e últimas posições: " + rSomatorio);
    }
}
package questoes;

public class Questao2 {

    public static double calcularMedia(int[] vetor1, int[] vetor2) {
        if (vetor1 == null || vetor2 == null || vetor1.length == 0 || vetor2.length == 0) {
            throw new IllegalArgumentException("Os vetores não podem ser nulos e devem conter elementos.");
        }

        double soma = 0;
        int totalElementos = 0;

        for (int elemento : vetor1) {
            soma += elemento;
            totalElementos++;
        }

        for (int elemento : vetor2) {
            soma += elemento;
            totalElementos++;
        }

        return soma / totalElementos;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {6, 7, 8, 9, 10};

        double media = calcularMedia(vetor1, vetor2);
        System.out.println("Média dos valores nos vetores: " + media);
    }
}

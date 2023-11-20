package questoes;

public class Questao4{

    public static double calcularMediaPonderada(int[] notas, int[] pesos) {
        if (notas == null || pesos == null || notas.length == 0 || pesos.length == 0 || notas.length != pesos.length) {
            throw new IllegalArgumentException("Os vetores de notas e pesos não podem ser nulos, devem conter elementos e ter o mesmo tamanho.");
        }

        double somaProdutos = 0, somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return somaProdutos / (somaPesos == 0 ? 1 : somaPesos);
    }

    public static void main(String[] args) {
        int[] notas = {7, 8, 6};
        int[] pesos = {2, 3, 1};

        double mediaPonderada = calcularMediaPonderada(notas, pesos);
        System.out.println("Média ponderada das notas: " + mediaPonderada);
    }
}

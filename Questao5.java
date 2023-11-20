package questoes;

public class Questao5{

    public static int contarElemento(int[] vetor1, int[] vetor2, int elemento) {
        int contagem = 0;

        for (int valor : vetor1) {
            if (valor == elemento) {
                contagem++;
            }
        }

        for (int valor : vetor2) {
            if (valor == elemento) {
                contagem++;
            }
        }

        return contagem;
    }

    public static void main(String[] args) {
    	
        int[] vetor1 = {1, 3, 3, 2, 5};
        int[] vetor2 = {1, 2, 3, 2, 4};
        int elemento = 2;

        int resultadoContagem = contarElemento(vetor1, vetor2, elemento);
        System.out.println("O elemento " + elemento + " aparece " + resultadoContagem + " vezes nos vetores.");
    }
}

package questoes;

public class Questao2 {

    public static void imprimirNumerosPares(int inicio, int fim) {
        if (inicio > fim) {
            System.out.println("Intervalo inválido. O número inicial deve ser menor ou igual ao número final.");
            return;
        }

        System.out.println("Números pares entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        imprimirNumerosPares(5, 15);
    }
}


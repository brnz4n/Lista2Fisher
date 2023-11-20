package questoes;

public class Questao18 {

    public static String inverterString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("A string não pode ser nula.");
        }

        char[] caracteres = input.toCharArray();

        int i = 0;
        int j = caracteres.length - 1;

        while (i < j) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;

            i++;
            j--;
        }

        return new String(caracteres);
    }

    public static void main(String[] args) {
        String textoOriginal = "hello";
        String textoInvertido = inverterString(textoOriginal);

        System.out.println("Texto Original:    " + textoOriginal);
        System.out.println("Texto Invertido: " + textoInvertido);
    }
}

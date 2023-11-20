package questoes;

public class Questao16 {

    public static boolean verificarPalindromo(String palavra) {
        if (palavra == null) {
            throw new IllegalArgumentException("A string não pode ser nula.");
        }

        int comprimento = palavra.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palindromo1 = "ana";
        String palindromo2 = "reconocer";
        String naoPalindromo = "java";

        System.out.println(palindromo1 + " é um palíndromo: " + verificarPalindromo(palindromo1)); // true
        System.out.println(palindromo2 + " é um palíndromo: " + verificarPalindromo(palindromo2)); // true
        System.out.println(naoPalindromo + " é um palíndromo: " + verificarPalindromo(naoPalindromo)); // false
    }
}

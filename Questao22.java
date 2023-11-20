package questoes;

import java.util.Scanner;

public class Questao22 {

    public static void imprimirFormaA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirFormaB(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("@ ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    public static void imprimirFormaC(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }
    }

    public static void imprimirFormaD(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void imprimirFormaE(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas e colunas desejadas: ");
        int n = scanner.nextInt();

        System.out.println("Forma A:");
        imprimirFormaA(n);

        System.out.println("\nForma B:");
        imprimirFormaB(n);

        System.out.println("\nForma C:");
        imprimirFormaC(n);

        System.out.println("\nForma D:");
        imprimirFormaD(n);

        System.out.println("\nForma E:");
        imprimirFormaE(n);
    }
}

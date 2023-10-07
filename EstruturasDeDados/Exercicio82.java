package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio82{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorM = new int[10];

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            vetorM[i] = vetorA[i] * x;
        }

        System.out.println("Vetor M (resultado da multiplicação):");
        for (int i = 0; i < 10; i++) {
            System.out.println("M[" + i + "] = " + vetorM[i]);
        }

        scanner.close();
    }
}


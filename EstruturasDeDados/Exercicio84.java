package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio84{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = scanner.nextInt();

        int[] vetorA = new int[N];
        int[] vetorB = new int[N];
        int[] vetorSoma = new int[N];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento na posição " + i + ": ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento na posição " + i + ": ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor Soma (A + B):");
        for (int i = 0; i < N; i++) {
            System.out.println("Soma[" + i + "] = " + vetorSoma[i]);
        }

        scanner.close();
    }
}


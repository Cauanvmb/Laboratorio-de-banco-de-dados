package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 50;

        int[] vet = new int[tamanho];

        System.out.println("Digite 50 números para preencher o vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vet[i] = scanner.nextInt();
        }

        boolean[] repetidos = new boolean[tamanho];
        boolean temRepetidos = false;

        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vet[i] == vet[j]) {
                    repetidos[i] = true;
                    repetidos[j] = true;
                    temRepetidos = true;
                }
            }
        }

        if (temRepetidos) {
            System.out.println("Números repetidos e suas posições:");

            for (int i = 0; i < tamanho; i++) {
                if (repetidos[i]) {
                    System.out.println("Número " + vet[i] + " na posição " + (i + 1));
                }
            }
        } else {
            System.out.println("Não há números repetidos no vetor.");
        }

        scanner.close();
    }
}

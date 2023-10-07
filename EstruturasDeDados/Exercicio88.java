package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 20;

        int[] vetor = new int[tamanho];

        System.out.println("Digite os 20 números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para verificar no vetor: ");
        int numeroVerificar = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroVerificar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            int[] novoVetor = new int[tamanho - 1];
            int j = 0; 
            for (int i = 0; i < tamanho; i++) {
                if (vetor[i] != numeroVerificar) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            }

            System.out.println("O número " + numeroVerificar + " foi encontrado no vetor.");
            System.out.println("Novo vetor sem o número " + numeroVerificar + ":");
            for (int i = 0; i < tamanho - 1; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("O número " + numeroVerificar + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
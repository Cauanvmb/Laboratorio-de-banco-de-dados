package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 30;

        int[] vetor = new int[tamanho];

        System.out.println("Digite os números para o vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o número para contar: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vezes no vetor.");

        scanner.close();
    }
}

package EstruturasDeDados;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor Ordenado em Ordem Crescente:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }

        scanner.close();
    }
}

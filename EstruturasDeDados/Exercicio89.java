package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 15;

        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("Digite os números para o vetor V1:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v1[i] = scanner.nextInt();
        }

        System.out.println("Digite os números para o vetor V2:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v2[i] = scanner.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (v1[i] == v2[i]) {
                contador++;
            }
        }

        System.out.println("Quantidade de números iguais nas mesmas posições: " + contador);

        scanner.close();
    }
}

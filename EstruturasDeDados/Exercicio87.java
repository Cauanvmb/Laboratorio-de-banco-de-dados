package EstruturasDeDados;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.print("Digite um novo número para inserir: ");
        int novoNumero = scanner.nextInt();

        int posicaoInsercao = 0;
        while (posicaoInsercao < tamanho && novoNumero > vetor[posicaoInsercao]) {
            posicaoInsercao++;
        }

        for (int i = tamanho - 1; i > posicaoInsercao; i--) {
            vetor[i] = vetor[i - 1];
        }

        vetor[posicaoInsercao] = novoNumero;

        System.out.println("Vetor com o novo número inserido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }

        scanner.close();
    }
}


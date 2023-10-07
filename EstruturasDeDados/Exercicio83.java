package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorNumeros = new int[20];

        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            vetorNumeros[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = 19; i >= 0; i--) {
            System.out.println(vetorNumeros[i]);
        }

        scanner.close();
    }
}


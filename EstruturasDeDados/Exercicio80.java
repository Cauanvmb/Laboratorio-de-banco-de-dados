package EstruturasDeDados;
import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorQ = new int[20];

        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
                vetorQ[i] = scanner.nextInt();
            } while (vetorQ[i] <= 0);
        }

        int maiorElemento = vetorQ[0];
        int posicaoMaiorElemento = 0;

        for (int i = 1; i < 20; i++) {
            if (vetorQ[i] > maiorElemento) {
                maiorElemento = vetorQ[i];
                posicaoMaiorElemento = i;
            }
        }

        System.out.println("O maior elemento é " + maiorElemento + " e ocupa a posição " + (posicaoMaiorElemento + 1) + " no vetor.");

        scanner.close();
    }
}

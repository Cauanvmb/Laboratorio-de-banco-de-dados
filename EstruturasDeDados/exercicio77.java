package EstruturasDeDados;
public class exercicio77 {
    public static void main(String[] args) {
        int[] vetor = {5, 1, 4, 2, 7, 8, 3, 6};
        int aux;

        for (int i = 7; i >= 5; i--) {
            aux = vetor[i];
            vetor[i] = vetor[7 - i + 1];
            vetor[7 - i + 1] = aux;
        }

        vetor[3] = vetor[1];
        vetor[vetor[3]] = vetor[vetor[2]];
        System.out.println("vetor: " + java.util.Arrays.toString(vetor));
    }

}

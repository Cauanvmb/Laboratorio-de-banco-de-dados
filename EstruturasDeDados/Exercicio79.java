package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double mediaTurma = soma / 20;

        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > mediaTurma) {
                acimaMedia++;
            }
        }

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Quantidade de alunos com nota acima da média: " + acimaMedia);

        scanner.close();
    }
}



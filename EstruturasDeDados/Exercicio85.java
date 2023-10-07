package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o número de dias no ano (365 dias)
        int diasNoAno = 365;

        // Criar um vetor para armazenar as temperaturas diárias
        double[] temperaturas = new double[diasNoAno];

        // Ler as temperaturas diárias e calcular a soma total
        double somaTemperaturas = 0;
        for (int dia = 0; dia < diasNoAno; dia++) {
            System.out.print("Digite a temperatura média para o dia " + (dia + 1) + ": ");
            temperaturas[dia] = scanner.nextDouble();
            somaTemperaturas += temperaturas[dia];
        }

        // Calcular a média anual
        double mediaAnual = somaTemperaturas / diasNoAno;

        // Inicializar as variáveis para encontrar a menor e a maior temperatura
        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];
        int diasInferioresMedia = 0;

        // Encontrar a menor e a maior temperatura, contar dias inferiores à média
        for (int dia = 0; dia < diasNoAno; dia++) {
            if (temperaturas[dia] < menorTemperatura) {
                menorTemperatura = temperaturas[dia];
            }
            if (temperaturas[dia] > maiorTemperatura) {
                maiorTemperatura = temperaturas[dia];
            }
            if (temperaturas[dia] < mediaAnual) {
                diasInferioresMedia++;
            }
        }

        // Imprimir os resultados
        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias no ano com temperatura inferior à média anual: " + diasInferioresMedia);

        scanner.close();
    }
}


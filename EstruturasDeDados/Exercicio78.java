package EstruturasDeDados;

import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome que deseja buscar: ");
        String nomeBuscado = scanner.nextLine();

        boolean encontrado = false;

        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }
}
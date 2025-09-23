package atividades;

import java.util.Scanner;

public class SomaLinhasColunas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3]; // cria a matriz 3x3

        // Preenche a matriz com valores do usuário
        for (int i = 0; i < 3; i++) { // percorre as linhas
            for (int j = 0; j < 3; j++) { // percorre as colunas
                System.out.print("Digite um valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Soma das linhas
        System.out.println("Soma das linhas:");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0; // zera a soma para cada linha
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j]; // soma os elementos da linha i
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }

        // Soma das colunas
        System.out.println("Soma das colunas:");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0; // zera a soma para cada coluna
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j]; // soma os elementos da coluna j
            }
            System.out.println("Coluna " + j + ": " + somaColuna);
        }

        scanner.close();
    }
}

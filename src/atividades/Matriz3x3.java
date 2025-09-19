package atividades;

import java.util.Scanner;

public class Matriz3x3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando uma matriz 3x3
        int[][] matriz = new int[3][3];

        // Preenche a matriz com valores do usuário
        for (int i = 0; i < 3; i++) { // percorre as linhas
            for (int j = 0; j < 3; j++) { // percorre as colunas
                System.out.print("Digite um valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                // Executa i;
                // Segue para j;
                // Ao finalizar retorna pra i;
                // Repete novamente até i atingir a quantia esperada de repetições;
            }
        }
    }
}
package atividades;

public class DiagonalPrincipal {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4]; // cria a matriz 4x4

        // Preenche a matriz com valores
        int contador = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = contador++;
            }
        }

        // Mostra os elementos da diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}

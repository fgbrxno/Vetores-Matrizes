package atividades;

// Commit: Criada a matriz 3x2 e exibida sua transposta

public class MatrizTransposta {
    public static void main(String[] args) {
        int[][] matriz3x2 = { {1, 2}, {3, 4}, {5, 6} };
        int[][] transposta = new int[2][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposta[j][i] = matriz3x2[i][j];
            }
        }

        System.out.println("Matriz Transposta 2x3:");
        for (int[] linha : transposta) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

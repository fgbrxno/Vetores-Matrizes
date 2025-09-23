package atividades;

public class MatrizIdentidade {

    public static void main(String[] args) {

        int[][] identidade = new int[5][5];
        for (int i = 0; i < 5; i++) {
            identidade[i][i] = 1;
        }

        System.out.println("Matriz Identidade 5x5:");
        for (int[] linha : identidade) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

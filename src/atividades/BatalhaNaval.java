package atividades;

import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        char[][] mar = new char[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mar[i][j] = '~';
                }
            }

        boolean[][] navios = new boolean[7][7];
        int naviosRestantes = 3;

        for (int i = 0; i < 3; i++) {
            int linha, coluna;
            do {
                linha = random.nextInt(7);
                coluna = random.nextInt(7);
            } while (navios[linha][coluna]);
            navios[linha][coluna] = true;
        }

    }
}


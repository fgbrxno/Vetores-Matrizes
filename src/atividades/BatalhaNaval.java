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

        System.out.println("Batalha Naval:");
        while (naviosRestantes > 0) {
            System.out.println("ajude o corinthians a derrubar os rivais, digite linha (0-6) e coluna (0-6):");
            int l = sc.nextInt();
            int c = sc.nextInt();

            if (navios[l][c]) {
                System.out.println("acertou, vai corinthians");
                mar[l][c] = 'X';
                navios[l][c] = false;
                naviosRestantes--;
            } else {
                System.out.println("só água :(");
                mar[l][c] = 'O';
            }

            for (char[] linha : mar) {
                for (char valor : linha) {
                    System.out.print(valor + " ");
                }
                System.out.println();
            }
        }

        System.out.println("todos os navios foram afundados, e o corinthians ganhou mais um mundial");
        sc.close();
    }
}

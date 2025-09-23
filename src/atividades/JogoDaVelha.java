package atividades;

// Commit: Criada lógica inicial do jogo da velha

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        boolean vezDoX = true;
        for (int rodada = 0; rodada < 5; rodada++) {
            System.out.println("Tabuleiro:");
            for (char[] linha : tabuleiro) {
                for (char valor : linha) {
                    System.out.print(valor + " ");
                }
                System.out.println();
            }

            System.out.println("Digite linha (0-2) e coluna (0-2):");
            int l = sc.nextInt();
            int c = sc.nextInt();

            if (tabuleiro[l][c] == '-') {
                tabuleiro[l][c] = vezDoX ? 'X' : 'O';
                vezDoX = !vezDoX;
            } else {
                System.out.println("Ja foi bobão, tenta outro.");
                rodada--;
            }
        }
        sc.close();
    }
}

package atividades;



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
    }
}

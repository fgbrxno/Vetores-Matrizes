package atividades;

public class RankingNotas {
    public static void main(String[] args) {
        double[][] notas = {
                {7.5, 8.0},
                {6.0, 9.0},
                {5.5, 4.0},
                {10.0, 9.5},
                {8.5, 7.0}
        };

        double[] medias = new double[5];
        System.out.println("Ranking de Notas:");
        for (int i = 0; i < 5; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
            System.out.println("Aluno " + (i + 1) + ": Média = " + medias[i]);
        }
    }
}

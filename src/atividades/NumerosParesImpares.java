package atividades;

public class NumerosParesImpares {

    public static void main(String[] args) {

        int[] numeros = new int[15];

        // Preencher o vetor com números aleatórios de 1 a 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            // Math.random() gera um número entre 0.0 e 1.0, depois é multiplicado por 100 e somado 1, resultando = 1 a 100
            // int muda o valor de decimal para inteiro
        }
    }
}
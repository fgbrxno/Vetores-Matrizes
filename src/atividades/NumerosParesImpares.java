package atividades;

public class NumerosParesImpares {

    public static void main(String[] args) {

        int[] numeros = new int[15];

        // Preenche o vetor com números aleatórios de 1 a 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            // Math.random() gera um número entre 0.0 e 1.0, depois é multiplicado por 100 e somado 1, resultando = 1 a 100
            // int muda o valor de decimal para inteiro
        }
        // Faz a separação entre numeros pares e ímpares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " é par");
            } else {
                System.out.println(numeros[i] + " é ímpar");
                // Se divisivel por 2 e resto = 0, então é par
                // Do contrario é ímpar
            }
        }

    }
}
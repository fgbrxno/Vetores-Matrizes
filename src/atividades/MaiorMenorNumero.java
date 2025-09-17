package atividades;

import java.util.Scanner;

public class MaiorMenorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Laço para ler os 10 números do usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt(); // Lê um número inteiro e armazena no vetor
        }

        // Variáveis para armazenar o maior e o menor número
        int maior = numeros[0];
        int menor = numeros[0];

        // Laço para percorrer o vetor e encontrar  o maior e menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
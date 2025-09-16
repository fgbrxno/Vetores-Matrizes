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
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int entrada = sc.nextInt();

        double[] vetor = new double[entrada];
        double soma = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / entrada;

        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int j = 0; j < vetor.length; j++){
            if(vetor[j] < media){
                System.out.println(vetor[j]);
            }
        }

        sc.close();
    }
}
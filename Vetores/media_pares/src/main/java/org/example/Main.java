package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int entrada = sc.nextInt();

        int[] vetor = new int[entrada];
        int contador = 0;
        int soma = 0;
        double media;


        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] % 2 == 0){
                contador += 1;
                soma += vetor[i];
            }

        }
        

        if (contador > 0){
            media = (double)soma / contador;
            System.out.print("MEDIA DOS PARES = " + media);

        }
        else {
            System.out.print("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
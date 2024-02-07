package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int entrada = sc.nextInt();

        int[] vetorA = new int[entrada];
        int[] vetorB = new int[entrada];
        int[] vetorC = new int[entrada];

        System.out.println("Digite os valores de A:");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Digite os valores de B:");
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = sc.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println();
        System.out.println("Vetor Resultante:");
        for(int i = 0; i < vetorA.length; i++){
            System.out.println(vetorC[i]);
        }



        sc.close();
    }
}
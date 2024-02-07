package org.example;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar? ");
        int entrada = sc.nextInt();

        int[] vetor = new int[entrada];
        int contador = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i]= sc.nextInt();
            if (vetor[i] % 2 == 0){
                contador += 1;
            }
        }

        System.out.println();

        System.out.println("NUMEROS PARES:");

        for (int j = 0; j < vetor.length; j++){
            if(vetor[j] % 2 == 0){
                System.out.print(" " + vetor[j]);
            }
        }


        System.out.println();
        System.out.println();

        System.out.print("QUANTIDADE DE PARES = " + contador);

        sc.close();
    }
}
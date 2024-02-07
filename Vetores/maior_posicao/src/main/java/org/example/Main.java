package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maior = 0;
        int posMaior = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int entrada = sc.nextInt();

        double[] vetor = new double[entrada];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            if (vetor[i] > maior){
                maior = vetor[i];
                posMaior = i;
            }
        }


        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);



        sc.close();
    }
}
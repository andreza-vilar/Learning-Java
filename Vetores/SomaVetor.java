package org.example;
import java.util.Locale;
import java.util.Scanner;


public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada;

        System.out.print("Quantos números você vai digitar? ");

        entrada = sc.nextInt();

        double[] vetor = new double [entrada];
        double soma = 0;

        for(int i = 0; i< vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];

        }

        double media = soma / vetor.length;

        System.out.println("Valores");
        for(int j = 0; j< vetor.length; j++){
            System.out.println(vetor[j]);
        }

        System.out.println("SOMA = " + soma);
        System.out.println("SOMA = " + media);

        sc.close();
    }
}

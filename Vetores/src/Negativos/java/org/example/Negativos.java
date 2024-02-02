package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada;

        System.out.print("Quantos numeros voce vai digitar? ");

        entrada = sc.nextInt();

        int[] vetorNumeros = new int[entrada];


        for (int i = 0; i < vetorNumeros.length; i++){
            System.out.print("Digite um numero: ");
            vetorNumeros[i] = sc.nextInt();
        }

        for (int j = 0; j < vetorNumeros.length; j++){
            if(vetorNumeros[j] < 0){
                System.out.println(vetorNumeros[j]);
            }
        }


        sc.close();

    }
}
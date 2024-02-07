package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serão digitadas? ");
        int entrada = sc.nextInt();

        String[] nomes = new String[entrada];
        int[] idades = new int[entrada];
        double[] alturas = new double [entrada];
        double alturaMedia = 0, alturaTotal = 0, porcentualMenores = 0;
        int contadorMenores = 0;


        for(int i = 0; i < entrada; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("altura: ");
            alturas[i] = sc.nextDouble();
        }


        for (int j = 0; j < entrada; j++){
            if(idades[j] < 16){
                contadorMenores +=1;
            }
            alturaTotal += alturas[j];
        }

        alturaMedia = alturaTotal / entrada;
        double percentual = ((double) contadorMenores / entrada) * 100;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);

        for (int i = 0; i<entrada; i++){
            if (idades[i] < 16){
                System.out.printf("%s\n", nomes[i]);
            }
        }




        sc.close();
    }
}
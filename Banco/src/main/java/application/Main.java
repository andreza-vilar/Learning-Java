package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta;

        System.out.print("Informe o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Informe o nome do titular: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Deseja fazer uma depósito inicial? (s/n) ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's' || resposta == 'S'){
            System.out.print("Qual o valor do deposito? ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, depositoInicial);
        }

        else{
            conta = new Conta(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        System.out.println();

        System.out.print("Informe um valor para depositar: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println();
        System.out.println("Dados atualizados sobre a conta: ");
        System.out.println(conta);

        System.out.println();

        System.out.print("Informe um valor para sacar: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
        System.out.println();
        System.out.println("Dados atualizados sobre a conta: ");
        System.out.println(conta);



        sc.close();
    }
}
package application;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Informe o numero de funcionarios: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Funcionario #" + i + " dados:");
            System.out.print("Terceirizado? (S/N) ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if(ch == 'S'){
                System.out.print("Custo adicional: ");
                double custoAdicional = sc.nextDouble();
                list.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, custoAdicional));

            }
            else{
                list.add(new Funcionario(nome, horas, valorPorHora));
            }

        }

        System.out.println();
        System.out.println("PAGAMENTOS: ");
        for(Funcionario func : list){
            System.out.println(func.getNome() +  " - $ " + String.format("%.2f", func.pagamento()));
        }


        sc.close();
    }
}
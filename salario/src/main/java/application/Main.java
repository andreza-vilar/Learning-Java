package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantos funcionários vão ser registrados?");
        int numeroFuncionarios = sc.nextInt();
        if (numeroFuncionarios <= 0){
            System.out.println("Cadastro finalizado");
            System.exit(1);

        }

        for(int i = 1; i <= numeroFuncionarios; i++){
            System.out.println();
            System.out.println("Funcionário #" + i + ":");

            System.out.print("ID: ");
            int ID = sc.nextInt();
            while (hasId(list, ID)) {
                System.out.print("Id already taken. Try again: ");
                ID = sc.nextInt();
            }


            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario(nome, ID, salario));
        }

        System.out.println();
        System.out.print("Digite o número ID do funcionário que terá um aumento no salário ");
        int id = sc.nextInt();
        Funcionario func = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        if(func == null){
            System.out.println("Esse ID não existe");
        }
        else {
            System.out.print("Digite a porcentagem do aumento ");
            double porcentagem = sc.nextDouble();
            func.aumento(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários");
        for (Funcionario obj : list){
            System.out.println(obj);
        }


        sc.close();
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        return emp != null;
    }
}
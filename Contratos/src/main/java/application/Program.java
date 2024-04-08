package application;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.classificacaoTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Entre com o nome do departamento: ");
        String departmento = sc.nextLine();
        System.out.println("Entre com os dados do profissional: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Níve;: ");
        String nivel = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, classificacaoTrabalho.valueOf(nivel),salarioBase, new Departamento(departmento));

        System.out.print("Quantos contratos o profissional possui? ");
        int numContratos = sc.nextInt();

        for (int i = 1; i <= numContratos; i++) {
            System.out.println("Entre contraro número #" + i + " data:");
            System.out.print("Data (dd/MM/aaa): ");
            Date contratoData = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duracão(horas) ");
            int horas = sc.nextInt();

            HoraContrato contrato = new HoraContrato(contratoData, valorHora, horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Entre com mês e ano para calcular a renda (MM/AAAA): ");
        String mesAno = sc.next();

        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: "+ trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Data do contrato " + mesAno + ": " + String.format("%.2f", trabalhador.calculaRenda(ano,mes)));


        sc.close();
    }
}

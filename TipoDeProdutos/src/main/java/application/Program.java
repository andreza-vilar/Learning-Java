package application;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Quantos produtos : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Comum, Usado, Importado? (c/u/i) ");
            char tipo = sc.next().charAt(0);

            System.out.print("Digite o nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Digite o preco do produto: ");
            double preco = sc.nextDouble();


            if (tipo == 'c') {
                list.add(new Produto(nome, preco));

            }

            else if (tipo == 'u'){
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new ProdutoUsado(nome, preco, date));
            }


            else{
                System.out.print("Taxa de importacao: ");
                double taxa = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxa));
            }



        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Produto produto : list) {
            System.out.println(produto.priceTag());
        }

        sc.close();
    }
}
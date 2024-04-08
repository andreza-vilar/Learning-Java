package application;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.StatusPedido;

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

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        Date dataNascimento = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("Entre com os dados do pedido: ");
        System.out.print("STATUS: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Order pedido = new Order(new Date(), status, cliente);

        System.out.print("Quantos itens vão ser processados?  ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.println("Informe os dados do item #" + i + "Dados do pedido: ");
            System.out.print("Nome do Produto ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preco do Produto ");
            double precoProduto = sc.nextDouble();

            Product product = new Product(nomeProduto, precoProduto);

            System.out.print("Quantidade ");
            int quantidadeProduto = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantidadeProduto, precoProduto, product);

            pedido.addItem(orderItem);
        }

        System.out.println();
        System.out.println("RESUMO DO PEDIDO");
        System.out.println(pedido);
    }
}
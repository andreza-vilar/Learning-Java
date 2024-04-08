package entities;

import enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private StatusPedido status;

    private Cliente cliente;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {}

    public Order(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }
    public Date getMomento() {
        return momento;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrderItem> getItems() {
        return items;
    }

   public void addItem(OrderItem item) {
        items.add(item);
   }

   public void removeItem(OrderItem item) {
        items.remove(item);
   }

   public double total(){
        double total = 0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }

        return total;
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hora do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens pedidos:\n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Valor total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }


}

package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Double total(){
        Double totalValue = 0.0;
        for (OrderItem i : items) {
            totalValue += i.subTotal();
        }

        return totalValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ");
        sb.append(moment.format(fmt) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order Items:" + "\n");
        for (OrderItem i : items) {
            sb.append(i.getProduct().getName() + ", $");
            sb.append(i.getPrice() + ", Quantity: " + i.getQuantity() + ", Subtotal: $" + i.subTotal() + "\n");
        }
        sb.append("Total price: $" + total() + "\n");

        return sb.toString();
    }
}

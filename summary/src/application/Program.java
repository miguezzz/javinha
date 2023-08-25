package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //DateTimeFormatter fmtTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        LocalDate birth = LocalDate.parse(sc.next(), fmt);

        Client client = new Client(name, email, birth);

        System.out.println("Enter order data:");
        System.out.println("Status: ");

        String status = sc.next();
        //sc.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        System.out.println("How many items to this order? ");
        int itemsQty = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= itemsQty; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name: ");
            String pname = sc.nextLine();
            System.out.println("Product price: ");
            Double pprice = sc.nextDouble();

            Product product = new Product(pname, pprice);

            System.out.println("Quantity: ");
            int pquantity = sc.nextInt();
            sc.nextLine();

            order.addItem(new OrderItem(pquantity, pprice, product));
        }

        System.out.println(order.toString());

        sc.close();
    }
}

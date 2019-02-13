package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Order;

import java.util.Scanner;

public class OrderReader implements ConsoleReader<Order>{

    public Order read(){
            Order order = new Order();
            Scanner scanner = new Scanner(System.in);
            System.out.println("OrderID: ");
            long orderID = scanner.nextLong();
            System.out.println("OrderStatus: ");
            String orderStatus = scanner.nextLine();
            order.setOrderID(orderID);
            order.setStatus(orderStatus);
            return order;
    }

}

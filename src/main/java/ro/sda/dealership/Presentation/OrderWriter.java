package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Order;

import java.util.List;

public class OrderWriter implements ConsoleWriter<Order> {
    public void write(Order value){
        System.out.println("Id: " + value.getOrderID());
        System.out.println("OrderStatus: " + value.getStatus());
    }

    public void writeAll(List<Order> orders){
        if(orders.size() == 0){
            System.out.println("No orders available");
        }else{
            System.out.println("Order list: ");
            for(Order order : orders){
                writeSummary(order);
            }
        }
    }

    private void writeSummary(Order order){
        System.out.print("Id: " + order.getOrderID());
        System.out.println("OrderStatus: " + order.getStatus());
    }
}

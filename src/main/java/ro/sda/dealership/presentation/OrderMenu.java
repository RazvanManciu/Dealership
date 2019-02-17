package ro.sda.dealership.presentation;

import ro.sda.dealership.model.Order;
import ro.sda.dealership.storage.OrderDAO;
import java.util.Scanner;

public class OrderMenu extends AbstractMenu {

    private OrderDAO orderDAO = new OrderDAO();
    private OrderReader reader = new OrderReader();
    private OrderWriter writer = new OrderWriter();

    protected void displayOption() {
        System.out.println("1.View all orders");
        System.out.println("2.View order details");
        System.out.println("3.Edit order");
        System.out.println("4.Add new order");
        System.out.println("5.Delete order");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
               writer.writeAll(orderDAO.findAll());
                break;
            case 2:
               displayOrderDetails();
                break;
            case 3:
               editOrderStatus();
                break;
            case 4:
               Order newOrder = reader.read();
               orderDAO.add(newOrder);
                break;
            case 5:
                System.out.println("Select order to delete");
                Long id = new Scanner(System.in).nextLong();
                orderDAO.deleteById(id);
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void editOrderStatus(){
        System.out.println("Select order to edit");
        Long id = new Scanner(System.in).nextLong();
        System.out.println("Enter order new status: ");
        String status = new Scanner(System.in).nextLine();
        Order order = orderDAO.findById(id);
        order.setOrderStatus(status);
        orderDAO.update(order);
    }

    private void displayOrderDetails(){
        System.out.println("Choose order by Id: ");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        Order searchedOrder = orderDAO.findById(id);
        writer.write(searchedOrder);
    }
}

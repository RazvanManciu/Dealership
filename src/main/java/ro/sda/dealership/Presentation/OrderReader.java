package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Car;
import ro.sda.dealership.Model.Client;
import ro.sda.dealership.Model.Order;
import ro.sda.dealership.Storage.CarDAO;
import ro.sda.dealership.Storage.ClientDAO;

import java.sql.Timestamp;
import java.util.Scanner;

public class OrderReader implements ConsoleReader<Order> {
    private ClientDAO clientDAO = new ClientDAO();
    private CarDAO carDAO = new CarDAO();

    public Order read() {
        Order order = new Order();
        Client client;
        Car car;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Select client id for order to be added: ");
            Long clientId = scanner.nextLong();
            client = clientDAO.findById(clientId);
        } while (client == null);
        do {
            System.out.println("Select car id for order to be added: ");
            Long carId = scanner.nextLong();
            car = carDAO.findById(carId);
        } while (car == null);
        Timestamp orderDate = new Timestamp(System.currentTimeMillis());
        System.out.println("Agent name: ");
        String agentName = scanner.nextLine();
        System.out.println("Order Status: ");
        String orderStatus = scanner.nextLine();
        order.setCar(car);
        order.setClient(client);
        order.setOrderDate(orderDate);
        order.setAgent(agentName);
        order.setStatus(orderStatus);
        return order;
    }

}

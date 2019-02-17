package ro.sda.dealership.service;

import ro.sda.dealership.storage.OrderDAO;
import ro.sda.dealership.model.Order;

import java.util.List;

public class OrderService {
    private OrderDAO orderDAO = new OrderDAO();
    public List<Order> getAllOrders(){
        return orderDAO.findAll();
    }

    public List<Order> getOrdersForClient(Long clientId){
        return orderDAO.findAllByClientId(clientId);
    }

}

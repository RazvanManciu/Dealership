package ro.sda.dealership.storage;

import ro.sda.dealership.model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO implements GenericDAO<Order> {
    private List<Order> orders = new ArrayList<Order>();

    public List<Order> findAll(){
        return orders;
    }

    public Order findById(Long id){
        for(Order order : orders){
            if(order.getOrderID().equals(id)){
                return order;
            }
        }
        return null;
    }

    public void update(Order order){
        delete(order);
        add(order);
    }

    public Order add(Order order){
        if(order.getOrderID() == null){
            order.setOrderID(generateNewId());
        }
        orders.add(order);
        return order;
    }

    public void delete(Order order){
        deleteById(order.getOrderID());
    }

    public void deleteById(Long id){
        Order deletedOrder = null;
        for (Order order : orders){
            if(order.getOrderID().equals(id)){
                deletedOrder = order;
            }
        }
        orders.remove(deletedOrder);
    }

    private Long generateNewId(){
        return  findMaxId() + 1;
    }

    private Long findMaxId(){
        Long max = -1L;
        for(Order order : orders){
            if(max < order.getOrderID()){
                max = order.getOrderID();
            }
        }
        return max;
    }
}

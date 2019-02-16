package ro.sda.dealership.storage;

import ro.sda.dealership.model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO extends GenericDAO<Order> {
    private static List<Order> orders = new ArrayList<Order>();

    protected List<Order> getItems() {
        return orders;
    }
}

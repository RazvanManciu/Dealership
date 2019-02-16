package ro.sda.dealership.storage;

import ro.sda.dealership.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockDAO extends GenericDAO<Stock> {

    private static List<Stock> stocks = new ArrayList<Stock>();

    protected List<Stock> getItems() {
        return stocks;
    }
}
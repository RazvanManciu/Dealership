package ro.sda.dealership.Storage;

import ro.sda.dealership.Model.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockDAO implements GenericDAO<Stock> {

    private List<Stock> stocks = new ArrayList<Stock>();

    public List<Stock> findAll() {
        return stocks;
    }

    public Stock findById(Long stockId) {
        for (Stock stock : stocks) {
            if (stock.getStockID().equals(stockId)) {
                return stock;
            }
        }
        return null;
    }

    public void update(Stock stock) {
        delete(stock);
        add(stock);
    }

    public Stock add(Stock stock) {
        if (stock.getStockID() == null) {
            stock.setStockID (generateNewId());
        }
        stocks.add(stock);
        return stock;
    }

    public void delete(Stock stock) {
        deleteById(stock.getStockID());
    }

    public void deleteById(Long stockID) {
        Stock deletedStock = null;
        for (Stock stock: stocks){
            if (stock.getStockID().equals(stockID)){
                deletedStock = stock;
            }
        }
        stocks.remove(deletedStock);
    }

    private Long generateNewId() {
        return findMaxId() + 1;
    }

    private Long findMaxId() {
        Long max = -1L;
        for (Stock stock : stocks) {
            if (max < stock.getStockID()) {
                max = stock.getStockID();
            }
        }
        return max;
    }
}
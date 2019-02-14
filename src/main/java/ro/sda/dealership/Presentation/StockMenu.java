package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Stock;
import ro.sda.dealership.Storage.StockDAO;

import java.util.Scanner;

public class StockMenu extends AbstractMenu {
    private StockDAO stockDAO = new StockDAO();
    private StockReader reader = new StockReader();
    private StockWriter writer = new StockWriter();

    protected void displayOption() {
        System.out.println("1.View stocks");
        System.out.println("2.View stock details");
        System.out.println("3.Edit stock");
        System.out.println("4.Add new stock");
        System.out.println("5.Delete stock");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                writer.writeAll(stockDAO.findAll());
                break;
            case 2:
                displayStockDetails();
                break;
            case 3:
                editStock();
                break;
            case 4:
                Stock newStock = reader.read();
                stockDAO.add(newStock);
                break;
            case 5:
                System.out.println("Select stock to delete");
                Long stockID = new Scanner(System.in).nextLong();
                stockDAO.deleteById(stockID);
                break;
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void editStock() {
        System.out.println("Select stock to edit");
        Long stockID = new Scanner(System.in).nextLong();
        System.out.println("Enter new quantity: ");
        Integer quantity = new Scanner(System.in).nextInt();
        System.out.println("Enter new location: ");
        String location = new Scanner(System.in).nextLine();
        Stock stock = stockDAO.findById(stockID);
        stock.setQuantity(quantity);
        stock.setLocation(location);
        stockDAO.update(stock);
    }

    private void displayStockDetails() {
        System.out.println("Choose stock by ID: ");
        Scanner scanner = new Scanner(System.in);
        Long stockID = scanner.nextLong();
        Stock searchedStock = stockDAO.findById(stockID);
        writer.write(searchedStock);
    }
}
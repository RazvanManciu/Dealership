package ro.sda.dealership.Presentation;

public class MainMenu extends AbstractMenu {

    protected void displayOption() {
        System.out.println("1.Products");
        System.out.println("2.Clients");
        System.out.println("3.Orders");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                System.out.println("Products menu");
                ProductMenu productMenu = new ProductMenu();
                productMenu.displayMenu();
                break;
            case 2:
                System.out.println("Clients menu");
                break;
            case 3:
                System.out.println("Order menu");
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

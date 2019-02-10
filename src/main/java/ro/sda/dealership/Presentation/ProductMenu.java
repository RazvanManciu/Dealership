package ro.sda.dealership.Presentation;

public class ProductMenu extends AbstractMenu {

    protected void displayOption() {
        System.out.println("1.View all products");
        System.out.println("2.View producp details");
        System.out.println("3.Edit product");
        System.out.println("4.Add new product");
        System.out.println("5.Delete product");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                System.out.println("List of products");
                break;
            case 2:
                System.out.println("Product details are:");
                break;
            case 3:
                System.out.println("Edit product");
                break;
            case 4:
                System.out.println("Add new product here");
                break;
            case 5:
                System.out.println("Select product to delete");
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

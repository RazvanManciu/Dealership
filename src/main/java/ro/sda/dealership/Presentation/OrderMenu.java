package ro.sda.dealership.Presentation;

public class OrderMenu extends AbstractMenu {

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
                System.out.println("List of orders");
                break;
            case 2:
                System.out.println("Order details are:");
                break;
            case 3:
                System.out.println("Edit order:");
                break;
            case 4:
                System.out.println("Add new order here");
                break;
            case 5:
                System.out.println("Select order to delete");
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

}

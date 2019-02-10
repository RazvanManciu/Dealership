package ro.sda.dealership.Presentation;

public class CarMenu extends AbstractMenu {

    protected void displayOption() {
        System.out.println("1.View all cars");
        System.out.println("2.View car details");
        System.out.println("3.Edit car");
        System.out.println("4.Add new car");
        System.out.println("5.Delete car");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                System.out.println("List of cars");
                break;
            case 2:
                System.out.println("Cars details are:");
                break;
            case 3:
                System.out.println("Edit car:");
                break;
            case 4:
                System.out.println("Add new car here");
                break;
            case 5:
                System.out.println("Select car to delete");
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

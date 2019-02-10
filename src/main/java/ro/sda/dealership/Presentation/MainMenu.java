package ro.sda.dealership.Presentation;

public class MainMenu extends AbstractMenu {

    protected void displayOption() {
        System.out.println("1. Cars");
        System.out.println("2. Agents");
        System.out.println("3. Orders");
        System.out.println("0. Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                System.out.println("Cars menu");
                CarMenu productMenu = new CarMenu();
                productMenu.displayMenu();
                break;
            case 2:
                System.out.println("Agents menu");
                AgentMenu agentMenu = new AgentMenu();
                agentMenu.displayMenu();
                break;
            case 3:
                System.out.println("Orders menu");
                OrderMenu orderMenu = new OrderMenu();
                orderMenu.displayMenu();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

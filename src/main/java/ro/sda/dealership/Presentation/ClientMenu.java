package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Client;

public class ClientMenu extends AbstractMenu {

    protected void displayOption() {
        System.out.println("1.View all agents");
        System.out.println("2.View agent details");
        System.out.println("3.Edit agent");
        System.out.println("4.Add new agent");
        System.out.println("5.Delete agent");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                System.out.println("List of clients");
                break;
            case 2:
                System.out.println("Client details are:");
                break;
            case 3:
                System.out.println("Edit client");
                break;
            case 4:
                ClientReader reader = new ClientReader();
                ClientWriter writer = new ClientWriter();
                Client client = reader.read();
                writer.write(client);
                break;
            case 5:
                System.out.println("Select client to delete");
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

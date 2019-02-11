package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Client;
import ro.sda.dealership.Storage.ClientDAO;
import java.util.Scanner;

public class ClientMenu extends AbstractMenu {

    ClientDAO clientDAO = new ClientDAO();
    ClientReader reader = new ClientReader();
    ClientWriter writer = new ClientWriter();

    protected void displayOption() {
        System.out.println("1.View all clients");
        System.out.println("2.View client details");
        System.out.println("3.Edit client");
        System.out.println("4.Add new client");
        System.out.println("5.Delete client");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                writer.writeAll(clientDAO.findAll());
                break;
            case 2:
                displayClientDetails();
                break;
            case 3:
                editAddress();
                break;
            case 4:
                Client newClient = reader.read();
                clientDAO.add(newClient);
                break;
            case 5:
                System.out.println("Select client to delete");
                Long id = new Scanner(System.in).nextLong();
                clientDAO.deleteById(id);
                break;
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void editAddress() {
        System.out.println("Select client to delete");
        Long id = new Scanner(System.in).nextLong();
        System.out.println("Enter new address: ");
        String address = new Scanner(System.in).nextLine();
        Client client = clientDAO.findById(id);
        client.setAdress(address);
        clientDAO.update(client);
    }

    private void displayClientDetails() {
        System.out.println("Choose cliend by Id: ");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        Client searchedClient = clientDAO.findById(id);
        writer.write(searchedClient);
    }
}

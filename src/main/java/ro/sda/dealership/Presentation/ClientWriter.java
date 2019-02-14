package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Client;

import java.util.List;

public class ClientWriter implements ConsoleWriter<Client> {
    public void write(Client client) {
        System.out.println("Id: " + client.getId());
        System.out.println("Name: " + client.getName());
        System.out.println("Adress: " + client.getAdress());
    }


    void writeAll(List<Client> clients) {
        if (clients.size() == 0) {
            System.out.println("No clients available");
        } else {
            System.out.println("Clients list: ");
            for (Client client : clients) {
               writeSummary(client);
            }
        }
    }

    private void writeSummary(Client client) {
        System.out.print("Id: " + client.getId());
        System.out.print(", Name: " + client.getName());
        System.out.println(", Adress: " + client.getAdress());
    }
}

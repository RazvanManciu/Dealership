package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Client;

import java.util.Scanner;

public class ClientReader implements ConsoleReader<Client> {

    public Client read() {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Adress: ");
        String adress = scanner.nextLine();
        client.setName(name);
        client.setAdress(adress);
        return client;
    }
}

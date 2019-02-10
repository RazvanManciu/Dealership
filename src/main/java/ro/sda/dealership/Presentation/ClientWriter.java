package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Client;

public class ClientWriter implements ConsoleWriter<Client> {
    public void write(Client value) {
        System.out.println("Name: " + value.getName());
        System.out.println("Adress: " + value.getAdress());
    }
}

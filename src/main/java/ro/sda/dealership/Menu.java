package ro.sda.dealership;

import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        Integer option = Integer.MAX_VALUE;
        while (option !=0){
            displayOptions();
            option = readOption();
            executeCmd(option);
        }
    }

    private void displayOptions(){
        System.out.println("1. Products");
        System.out.println("2. Clients");
        System.out.println("3. Orders");
        System.out.println("0. Exit");
    }

    private Integer readOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your option is: ");
        return scanner.nextInt();
    }

    private void executeCmd(Integer option){
        switch(option){
            case 1:
                System.out.println("Products menu");
                break;
            case 2:
                System.out.println("Client menu");
                break;
            case 3:
                System.out.println("Order menu");
                break;
            case 0:
                System.out.println("Exiting");
                break;
            default:
                 System.out.println("Invalid option");
        }
    }
}

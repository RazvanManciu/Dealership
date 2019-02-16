package ro.sda.dealership.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtil {
    static Scanner scanner = new Scanner(System.in);

    static final Integer MAX_RETRIES = 2;

    public static Long readLong(String inputMessage, String invalidInputMessage){
        Long result = null;

        int retries = 0;

        while (retries < MAX_RETRIES && result == null){
            try {
                System.out.print(inputMessage);
                result = scanner.nextLong();

            }catch (InputMismatchException e){
                System.out.println(invalidInputMessage);
            }
            retries ++;
        }
        return  result;
    }

    public  static Double getPrice(){
        double price = 0d;
        while (true){
            try {
                price = scanner.nextDouble();
            }catch (InputMismatchException e){
                scanner.nextLine();
            }
            if (price <= 0)
                System.out.println("Incorrect price. Insert again: ");
            else break;
        }
        return price;
    }
}

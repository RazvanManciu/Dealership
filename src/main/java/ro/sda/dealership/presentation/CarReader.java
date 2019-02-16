package ro.sda.dealership.presentation;

import ro.sda.dealership.model.Car;

import java.util.Scanner;

public class CarReader implements ConsoleReader<Car> {

    public Car read(){
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Car model: ");
        String model = scanner.nextLine();
        System.out.println("Car Color: ");
        String color = scanner.nextLine();
        car.setCarModel(model);
        car.setCarColor(color);
        return car;
    }
}

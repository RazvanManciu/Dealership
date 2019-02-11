package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Car;
import ro.sda.dealership.Storage.CarDAO;
import java.util.Scanner;

public class CarMenu extends AbstractMenu {

    CarDAO carDAO = new CarDAO();
    CarReader reader = new CarReader();
    CarWriter writer = new CarWriter();

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
                writer.writeAll(carDAO.findAll());
                break;
            case 2:
               displayCarDetails();
                break;
            case 3:
               editCarModel();
                break;
            case 4:
               Car newCar = reader.read();
               carDAO.add(newCar);
                break;
            case 5:
                System.out.println("Select car to delete");
                Long id = new Scanner(System.in).nextLong();
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void editCarModel(){
        System.out.println("Select car to delete");
        Long id = new Scanner(System.in).nextLong();
        System.out.println("Enter new car: ");
        String carModel = new Scanner(System.in).nextLine();
        Car car = carDAO.findById(id);
        car.setCarModel(carModel);
        carDAO.update(car);
    }

    private void displayCarDetails(){
        System.out.println("Choose car by Id: ");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        Car searchedCar = carDAO.findById(id);
        writer.write(searchedCar);
    }
}

package ro.sda.dealership.Presentation;

import ro.sda.dealership.Model.Car;

import java.util.List;

public class CarWriter implements ConsoleWriter<Car> {
    public void write(Car value){
        System.out.println("Id: " + value.getCarID());
        System.out.println("Car model: " + value.getCarModel());
        System.out.println("Car color: " + value.getCarColor());
    }

    public void writeAll(List<Car> cars){
        if(cars.size() == 0){
            System.out.println("No cars available");
        }else{
            System.out.println("Cars list: ");
            for(Car car : cars){
                writeSummary(car);
            }
        }
    }

    private void writeSummary(Car car){
        System.out.print("Id: " + car.getCarID());
        System.out.print(", Car model: " + car.getCarModel());
        System.out.println(", Car color: " + car.getCarColor());
    }
}

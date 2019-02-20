package ro.sda.dealership.service;

import ro.sda.dealership.storage.CarDAO;
import ro.sda.dealership.model.Car;

import java.util.List;

public class CarService {
    private CarDAO carDAO = new CarDAO();

    public List<Car> getAllCars(){
        return carDAO.findAll();
    }

    public Car getCar(Long id){
        return carDAO.findById(id);
    }

    public Car save(Car car){
        Car updatedCar = null;
        if(car.getId() == null){
            updatedCar = carDAO.add(car);
        }else{
            carDAO.update(car);
            updatedCar = car;
        }
        return updatedCar;
    }

    public boolean delete(Long id){
        return carDAO.deleteById(id);
    }
}

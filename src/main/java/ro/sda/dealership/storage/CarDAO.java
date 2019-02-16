package ro.sda.dealership.storage;

import ro.sda.dealership.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDAO implements GenericDAO<Car> {
    private List<Car> cars = new ArrayList<Car>();

    public List<Car> findAll() {
        return cars;
    }

    public Car findById(Long id) {
        for (Car car : cars) {
            if (car.getCarID().equals(id)) {
                return car;
            }
        }
        return null;
    }

    public void update(Car car) {
        delete(car);
        add(car);
    }

    public Car add(Car car) {
        if(car.getCarID() == null){
            car.setCarID(generateNewId());
        }
        cars.add(car);
        return car;
    }

    public void delete(Car car) {
        deleteById(car.getCarID());
    }

    public void deleteById(Long id) {
        Car deletedCar = null;
        for (Car car : cars) {
            if (car.getCarID().equals(id)) {
                deletedCar = car;
            }
        }
        cars.remove(deletedCar);
    }

    private Long generateNewId(){
        return findMaxId() + 1;
    }

    private Long findMaxId(){
        Long max = -1L;
        for(Car car : cars){
            if(max < car.getCarID()){
                max = car.getCarID();
            }
        }
        return max;
    }
}


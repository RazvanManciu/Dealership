package ro.sda.dealership.Model;

public class Car {
    private Integer carID;
    private String carModel;
    private Integer priceCar;
    private String carColor;

    public Car(Integer carID, String carModel, Integer priceCar, String carColor) {
        this.carID = carID;
        this.carModel = carModel;
        this.priceCar = priceCar;
        this.carColor = carColor;
    }

    public Integer getCarID() {
        return carID;
    }

    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(Integer priceCar) {
        this.priceCar = priceCar;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}

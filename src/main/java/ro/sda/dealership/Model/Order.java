package ro.sda.dealership.Model;

public class Order {
    private Integer orderID;
    private Car car;
    private String client;
    private String offerDetails;
    private Agent agent;

    public Order(Integer orderID, Car car, String client, String offerDetails, Agent agent) {
        this.orderID = orderID;
        this.car = car;
        this.client = client;
        this.offerDetails = offerDetails;
        this.agent = agent;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getOfferDetails() {
        return offerDetails;
    }

    public void setOfferDetails(String offerDetails) {
        this.offerDetails = offerDetails;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}

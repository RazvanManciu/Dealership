package ro.sda.dealership.Model;

public class Client {
    private long id;
    private String name;
    private String phoneNumber;
    private String socialId;
    private String adress;

    public Client(long id, String name, String phoneNumber, String socialId, String adress) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.socialId = socialId;
        this.adress = adress;
    }

    public Client() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

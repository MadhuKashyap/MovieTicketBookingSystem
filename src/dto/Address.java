package dto;

public class Address {
    int pin;
    String city;
    String state;
    String country;

    public Address(int pin, String city, String state, String country) {
        this.pin = pin;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

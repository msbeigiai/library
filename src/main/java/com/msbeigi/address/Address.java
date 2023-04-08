package com.msbeigi.address;

public class Address extends Location {

    private String street;
    private String city;

    public Address() {
    }

    public Address(int latitude, int longitude, String street, String city) {
        super(latitude, longitude);
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("street='").append(street).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append('}');
        return sb.toString();
    }
}

package org.example.Task3;

public class Address {
    private String zipCode;
    private String country;
    private String city;

    public Address() {
        this.zipCode = "69001";
        this.country = "Ukraine";
        this.city = "Zaporizhzhia";
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
                "zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

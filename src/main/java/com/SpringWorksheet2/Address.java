package com.SpringWorksheet2;

public class Address {
    private String city;


    @Override
    public String toString() {
        return "Address {" + "pincode= " + pincode + " , city= " + city + "}";
    }


    private String pincode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

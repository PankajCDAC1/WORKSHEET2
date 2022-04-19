package com.SpringWorksheet2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public Student() {
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}

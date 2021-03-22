package com.shivenderkumar.encodedecode.models;

public class ChainDetailResponseAddress {
    public String AddressLine1;
    public String AddressLine2;
    public String City;
    public String State;
    public String Country;
    public String Zip;


    @Override
    public String toString() {
        return "{" +
                "\"AddressLine1\":'" + AddressLine1 + '\'' +
                ",\"AddressLine2\":'" + AddressLine2 + '\'' +
                ",\"City\":'" + City + '\'' +
                ",\"State\":'" + State + '\'' +
                ",\"Country\":'" + Country + '\'' +
                ",\"Zip\":'" + Zip + '\'' +
                '}';
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }
}

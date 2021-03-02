package com.xuan.pojo;

public class Address {
    private String addresss;

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addresss='" + addresss + '\'' +
                '}';
    }
}

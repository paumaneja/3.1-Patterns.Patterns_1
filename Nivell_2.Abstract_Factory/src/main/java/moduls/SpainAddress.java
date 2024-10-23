package moduls;

import interfaces.Address;

public class SpainAddress implements Address {

    private String address;

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }
}

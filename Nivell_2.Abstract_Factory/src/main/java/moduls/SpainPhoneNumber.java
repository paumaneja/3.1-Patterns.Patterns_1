package moduls;

import interfaces.PhoneNumber;

public class SpainPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = "+34" + phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}

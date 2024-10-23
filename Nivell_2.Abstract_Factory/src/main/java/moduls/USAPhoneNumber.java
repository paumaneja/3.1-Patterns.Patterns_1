package moduls;

import interfaces.PhoneNumber;

public class USAPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}

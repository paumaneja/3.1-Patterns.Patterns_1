package moduls;

import interfaces.PhoneNumber;

public class SpainPhoneNumber implements PhoneNumber {

    private String phoneNumber;

    public SpainPhoneNumber(){

        this.phoneNumber = "+34 666 66 66";
    }

    @Override
    public String getFormattedPhoneNumber() {

        return phoneNumber;
    }
}

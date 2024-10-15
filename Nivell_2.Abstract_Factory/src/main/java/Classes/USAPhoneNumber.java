package Classes;

import Interfaces.PhoneNumber;

public class USAPhoneNumber implements PhoneNumber {

    private String phoneNumber = "+1 999 999 9999";

    @Override
    public String getFormattedPhoneNumber() {
        return phoneNumber;
    }
}

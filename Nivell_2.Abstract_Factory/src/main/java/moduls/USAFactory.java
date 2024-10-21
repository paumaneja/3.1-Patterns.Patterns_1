package moduls;

import interfaces.AbstractFactory;
import interfaces.Address;
import interfaces.PhoneNumber;

public class USAFactory implements AbstractFactory {

    @Override
    public Address createAddress() {

        return new USAAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {

        return new USAPhoneNumber();
    }

}

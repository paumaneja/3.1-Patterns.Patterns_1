package moduls;

import interfaces.AbstractFactory;
import interfaces.Address;
import interfaces.PhoneNumber;

public class SpainFactory implements AbstractFactory {

    @Override
    public Address createAddress() {
        return new SpainAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new SpainPhoneNumber();
    }
}

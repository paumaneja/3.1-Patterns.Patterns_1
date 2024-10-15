package Classes;

import Interfaces.AbstractFactory;
import Interfaces.Address;
import Interfaces.PhoneNumber;

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

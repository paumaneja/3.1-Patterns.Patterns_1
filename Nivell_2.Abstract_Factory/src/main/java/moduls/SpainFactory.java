package moduls;

import interfaces.InternacionalFactory;
import interfaces.Address;
import interfaces.PhoneNumber;

public class SpainFactory implements InternacionalFactory {

    @Override
    public Address createAddress() {
        return new SpainAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new SpainPhoneNumber();
    }
}

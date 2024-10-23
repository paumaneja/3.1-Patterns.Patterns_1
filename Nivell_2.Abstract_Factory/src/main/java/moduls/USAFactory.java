package moduls;

import interfaces.InternacionalFactory;
import interfaces.Address;
import interfaces.PhoneNumber;

public class USAFactory implements InternacionalFactory {

    @Override
    public Address createAddress() {
        return new USAAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USAPhoneNumber();
    }

}
